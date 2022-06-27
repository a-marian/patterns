package ar.com.patterns.structural.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        Internet internet = new ProxyVirtualPrivateNet();
        internet.connectToHost("work-site.com");
        internet.connectToHost("tiktok.com");
    }
}
