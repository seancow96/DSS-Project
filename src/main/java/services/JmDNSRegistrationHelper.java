/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

/**
 *
 * @author dominic
 */
public class JmDNSRegistrationHelper {

    private JmDNS jmdns;
    private ServiceInfo info;

    public JmDNSRegistrationHelper(String name, String type, String location, int port) {
        try {
            jmdns = JmDNS.create(InetAddress.getLocalHost());
            info = ServiceInfo.create(type, name, port,
                    "params=" + location);
            jmdns.registerService(info);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findFreePort() throws IOException {
        ServerSocket server = new ServerSocket(0);
        int port = server.getLocalPort();
        server.close();
        return port;
    }

    public void deRegister() {
        jmdns.unregisterService(info);

    }

    public ServiceInfo getInfo() {
        return info;
    }
}
