package ar.com.patterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * Use the proxy pattern to create a representative object that controls access to another object,
 * which maybe remote, expensive to create or in need of securing.
 * The proxy pattern provides a surrogate or placeholder for another object to control access to it.
 * */
public class ProxyVirtualPrivateNet implements Internet {

    private Internet net = new VirtualPrivateNet();
    private List<String> bannedUrls = Arrays.asList("facebook.com", "instagram.com", "tiktok.com", "twitter.com");


    @Override
    public void connectToHost(String url) {
        if (bannedUrls.contains(url.toLowerCase())){
            throw new RuntimeException("Access denied: connecting to ".concat(url));
        }
        net.connectToHost(url);
    }
}
