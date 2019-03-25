this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(File.dirname(this_dir), 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'recommender_services_pb'

include Recommender

def run_get_feature(stub)
  p 'Get movies'
  p '----------'
  resp = stub.get_all_movies(Google::Protobuf::Empty.new)
  resp.movies.each { |i| puts i.title }
end

def run_get_recommendations(stub)
  movies = []
  movies << Movie.new(title: "Terminator", genre: "Awesome", director: "James Cameron")
  movies << Movie.new(title: "Predator", genre: "Awesome", director: "James Cameron")
  
  profile = Profile.new(age: 12, name: "Dominic", seen: movies)
  resp = stub.recommend_movie(profile)
  resp.movies.each { |i| puts i.title }
end

def run_stream(stub)
  p 'ListFeatures'
  p '------------'
  resps = stub.stream_new_movies(Google::Protobuf::Empty.new)
  resps.each do |r|
    p "- found '#{r.title}"
  end
end

def main
  stub = MovieRecommender::Stub.new('localhost:50051', :this_channel_is_insecure)
  run_get_feature(stub)
  run_get_recommendations(stub)
  run_stream(stub)

end

main
