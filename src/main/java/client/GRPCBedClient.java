package client;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Iterator;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dominic.example.bed.BedGrpc;
import org.dominic.example.bed.BedStatus;

/**
 * A simple client that requests a greeting from the {@link HelloWorldServer}.
 */
public class GRPCBedClient {

}
