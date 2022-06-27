package ar.com.patterns.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {

        Consumer consumer = new Consumer(new IPhoneBuilder());
        consumer.buildCellPhone();
        CellPhone iphone = consumer.orderCellPhone();
        System.out.println("Order 1: " + iphone);

        consumer = new Consumer(new SamsungBuilder());
        consumer.buildCellPhone();
        CellPhone samsung = consumer.orderCellPhone();
        System.out.println("order 2: " + samsung);
    }
}
