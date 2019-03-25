package client;

import javax.swing.JPanel;
import clientui.BedClientGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dominic.example.bed.BedGrpc;
import org.dominic.example.bed.BedStatus;

public class BedClient implements ServiceObserver {

    protected BedClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(GRPCBedClient.class.getName());

    private ManagedChannel channel;
    private BedGrpc.BedBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public BedClient() {
        serviceType = "_bed._udp.local.";
        name = "Bedroom";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new BedClientGUI(BedClient.this);
                ui.setVisible(true);
            }
        });
    }

    String getServiceType() {
        return serviceType;
    }

    void disable() {
        // no services exist for this client type
    }

    public List<String> serviceInterests() {
        List<String> interests = new ArrayList<String>();
        interests.add(serviceType);
        return interests;
    }

    public void serviceAdded(ServiceDescription service) {
        System.out.println("service added");
        current = service;
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = BedGrpc.newBlockingStub(channel);
    }

    public boolean interested(String type) {
        return serviceType.equals(type);
    }

    public String getName() {
        return name;
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * Say hello to server.
     */
    
    
    
    
    public void warm() {
        try {

            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<BedStatus> response = blockingStub.warm(request);
                    while (response.hasNext()) {
                        ui.append(response.next().toString());
                    }
                }
            }.start();

            Empty request = Empty.newBuilder().build();
            BedStatus status = blockingStub.getStatus(request);
            System.out.println("The percentage heated is " + status);

        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }

    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new BedClient();
    }

}
