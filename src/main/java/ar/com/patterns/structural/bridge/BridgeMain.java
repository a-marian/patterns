package ar.com.patterns.structural.bridge;
/**
 * Use the bridge pattern to vary not only your implementations, but also your abstraction
 * Benefits
 * * Decouples an implementation so that it is not boud permanently to an interface
 * * Abstraction and implementation can be extended independently
 * * Changes to the concrete abstraction classes don't affect the client.
 * * * Increases complexity
 * */
public class BridgeMain {
    public static void main(String[] args) {

        Device device1 = new Cellphone(new Produce(), new Assemble());
        device1.manufacture();
        Device device2 = new Watch(new Produce(), new Assemble());
        device2.manufacture();


    }
}
