package ar.com.patterns.structural.proxy;

public class VirtualPrivateNet implements Internet {

    @Override
    public void connectToHost(String url) {
           System.out.println("Connecting to :".concat(url));
    }
}
