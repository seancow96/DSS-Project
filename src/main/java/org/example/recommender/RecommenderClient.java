package org.example.recommender;

import client.ServiceDescription;
import client.ServiceObserver;
import client.jmDNSServiceTracker;
import clientui.RecomenderClientGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.recommender.Movie;
import org.example.recommender.MovieRecommenderGrpc;
import org.example.recommender.Profile;
import org.example.recommender.Recommendations;

/**
 * A simple client that requests a greeting from the {@link HelloWorldServer}.
 */
public class RecommenderClient implements ServiceObserver {

    private static final Logger logger = Logger.getLogger(RecommenderClient.class.getName());
    protected RecomenderClientGUI ui;

    private ManagedChannel channel;
    private MovieRecommenderGrpc.MovieRecommenderBlockingStub blockingStub;
    private final String interestedService;

    /**
     * Construct client connecting to HelloWorld server at {@code host:port}.
     */
    public RecommenderClient() {
        interestedService = "_movie-recommender._udp.local.";

        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new RecomenderClientGUI(RecommenderClient.this);
                ui.setVisible(true);
            }
        });

    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * Say hello to server.
     */
    public void getRecommendations() {
        try {

            Movie terminator = Movie.newBuilder().setTitle("Terminator").setGenre("Awesome").build();
            Movie predator = Movie.newBuilder().setTitle("Predator").setGenre("Awesomest").build();
            ArrayList<Movie> movies = new ArrayList<Movie>();
            movies.add(terminator);
            movies.add(predator);
            Profile profile = Profile.newBuilder().addAllSeen(movies).setAge(25).setName("Paul").build();

            Recommendations recommended = blockingStub.recommendMovie(profile);
            List<Movie> recommendedMovies = recommended.getMoviesList();
            for (Movie mov : recommendedMovies) {
                System.out.println(mov);
            }

//            logger.info("Greeting: " + response.getMessage());
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
    
    
    
    

    public void getAllMovies() {
        if (channel == null) {
            System.out.println("No appropriate service was found yet");
        } else {
            Empty request = Empty.newBuilder().build();
            System.out.println("I am about to try to call the get all movies from the server");
            Recommendations recommended = blockingStub.getAllMovies(request);
            List<Movie> recommendedMovies = recommended.getMoviesList();
            for (Movie mov : recommendedMovies) {
                ui.append(mov.toString());

            }
        }
    }
    
    
    
    
    

    public boolean interested(String type) {
        return interestedService.equals(type);
    }

    public List<String> serviceInterests() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(interestedService);
        return list;
    }

    public void serviceAdded(ServiceDescription service) {

        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = MovieRecommenderGrpc.newBlockingStub(channel);
        System.out.println("I got the information about the service, now i can call the service");
        getAllMovies();
    }

    public String getName() {
        return "Movie Client";
    }

    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) throws Exception {
        RecommenderClient client = new RecommenderClient();
//        try {
//            client.getRecommendations();
//            client.getAllMovies();
//        } finally {
//            client.shutdown();
//        }
    }
}
