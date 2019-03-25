package client;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

public class jmDNSServiceTracker implements ServiceListener {

    private JmDNS jmdns;
    private static jmDNSServiceTracker instance;
    ServiceObserver observer;

    private jmDNSServiceTracker() {
        try {
            jmdns = JmDNS.create(InetAddress.getLocalHost());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static jmDNSServiceTracker getInstance() {
        if (instance == null) {
            instance = new jmDNSServiceTracker();
        }
        return instance;
    }

    public void register(ServiceObserver observer) {
        this.observer = observer;
        jmdns.addServiceListener(observer.serviceInterests().get(0), this);

    }

    public void end() {
        try {
            jmdns.close();
        } catch (IOException ex) {
            Logger.getLogger(jmDNSServiceTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void serviceAdded(ServiceEvent arg0) {
        System.out.println(arg0);
        arg0.getDNS().requestServiceInfo(arg0.getType(), arg0.getName(), 0);
    }

    public void serviceRemoved(ServiceEvent arg0) {
//        System.out.println(arg0);
//        String type = arg0.getType();
//        String name = arg0.getName();
//        ServiceInfo newService = null;
//        if (client.getServiceType().equals(type) && client.hasMultiple()) {
//            if (client.isCurrent(name)) {
//                ServiceInfo[] a = jmdns.list(type);
//                for (ServiceInfo in : a) {
//                    if (!in.getName().equals(name)) {
//                        newService = in;
//                    }
//                }
//                client.switchService(newService);
//            }
//            client.remove(name);
//        } else if (client.getServiceType().equals(type)) {
//            ui.removePanel(client.returnUI());
//            client.disable();
//        }
    }

    public void serviceResolved(ServiceEvent arg0) {
        System.out.println(arg0);
        String address = arg0.getInfo().getHostAddress();
        int port = arg0.getInfo().getPort();
        String type = arg0.getInfo().getType();

        if (observer != null && observer.interested(type)) {
            observer.serviceAdded(new ServiceDescription(address, port));
        }
    }
}
