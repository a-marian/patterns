package ar.com.patterns.structural.bridge;

/**Extends the abstraction takes the finer detail one level below.
 * Hides the finer elements from implementors*/
class Cellphone extends Device {

    public Cellphone(Workshop workshop1, Workshop workshop2){
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.println("Cellphone: ");
        workshop1.work();
        System.out.print(" and ");
        workshop2.work();
    }
}
