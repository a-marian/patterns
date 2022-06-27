package ar.com.patterns.structural.bridge;

/**
 * Core of the bridge pattern, contains a reference to the implementer(s)*/
abstract class Device {

    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Device(Workshop workshop1, Workshop workshop2){
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract  void  manufacture();
}
