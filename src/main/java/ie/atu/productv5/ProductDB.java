package ie.atu.productv5;

import ie.atu.productv5.Book;
import ie.atu.productv5.Music;
import ie.atu.productv5.Product;
import ie.atu.productv5.*;

public class ProductDB {

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            ie.atu.productv5.Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("pink")) {
            ie.atu.productv5.Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("the Columbia group");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("kdl43")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(819.00);
            myTV.setManufacture("Sony");
            myTV.setScreen("55 inches");
            p = myTV;
        }

        if (productCode.equalsIgnoreCase("Horse")) {
            Horse myHorse = new Horse();
            myHorse.setType(productCode);
            myHorse.setAge("3 Years Old");
            myHorse.setBreed("Arabian");
            myHorse.setPrice(700);
            myHorse.setDam("The Dam is Arabian");
            myHorse.setSire("The Sire is Arabian");
            myHorse.setHeight("150cm");
            p = myHorse;
        }

        if (productCode.equalsIgnoreCase("Dog")) {
            Dog myDog = new Dog();
            myDog.setType(productCode);
            myDog.setAge("3 Years Old");
            myDog.setBreed("Arabian");
            myDog.setPrice(700);
            myDog.setVaccination("Yes");
            myDog.setShedding("Yes");
            myDog.setNeutered("No");
            p = myDog;
        }

        return p;
    }
}

