package ar.com.patterns.creational.prototype;

import java.io.File;

public class PrototypeMain {

    public static void main(String[] args) {

        String archiverTypeTwo = "rar";
        String archiverTypeOne = "zip";

        Archiver zipArchiver = ArchiverFactory.getPrototypeForType(archiverTypeTwo);
        Archiver rarArchiver = ArchiverFactory.getPrototypeForType(archiverTypeOne);

        zipArchiver.archive(new File(""));
        rarArchiver.archive(new File(""));
    }
}
