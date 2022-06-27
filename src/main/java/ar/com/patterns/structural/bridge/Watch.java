package ar.com.patterns.structural.bridge;

class Watch extends Device {

    public Watch(Workshop workshop1, Workshop workshop2){
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.println(" Watch: ");
        workshop1.work();
        System.out.print(" and ");
        workshop2.work();
    }
}
