package hw8_z;

public class Work {
    public static void main(String[] args){
        Book book = new Book();
        book.name = "Harry Potter";
        book.author = "J.R.R.Tolkien";
        book.genres = "Fantasy Fiction";
        book.numberOfBooks = 7;
        book.publishedYear = 1997;
        book.price = 28.9;

        Book book2 = new Book();
        book2.name = "Lord of the Rings";
        book2.author = "J.K.Rowling";
        book2.genres = "Fantasy Adventure";
        book2.numberOfBooks = 6;
        book2.publishedYear = 1954;
        book2.price = 35.99;

//        System.out.print("The most popular book over the world is: " + "\n" +book.name +
//                "\nAuthor - "+ book.author + "\nGenres - "+ book.genres + "\nNumber of books - "+ book.numberOfBooks +
//                "\nYear of publish - " + book.publishedYear+ "\nPrice - "+ book.price);

        book.bookInfo();
        book2.bookInfo2();
        if(book.publishedYear<book2.publishedYear) {
            System.out.println("Harry Potter was published later");
        }else{
        }System.out.println("Lord of the Rings was firstly published 64 years ago");

        Furniture table = new Furniture();
        table.type = "table";
        table.material = "plastic";
        table.shape = "round";
        table.color = "clear";

        System.out.println("\nI am looking online to buy a "+ table.shape+ " " + table.material + " " + table.type +
                " and which has a "+ table.color+ " color");
        table.expand();


            VacationPlan trip = new VacationPlan();
            trip.country = "Italy";
            trip.city = "Florence";
            trip.numberOfDays = 10;
            trip.dates = "From 1 Aug to 10 Aug";
            trip.price = 1540.99;

            System.out.println("We are going to " + trip.city+ " in "+ trip.country+ " for "
                    + trip.numberOfDays+ " days which are "+ trip.dates+". We have paid "+trip.price+ " $ in total");
            trip.getsCheaper();

            VacationPlan trip2 = new VacationPlan();
            trip2.country = "Spain";
            trip2.city = "Alicante";
            trip2.numberOfDays = 15;
            trip2.dates = "From 5 Aug to 20 Aug";
            trip2.price = 1280.53;

            if (trip.price>trip2.price) {
                System.out.println("We will go to Spain as it is cheaper");
            }else{
                System.out.println("We wil go to Italy");

            }


            PatientInfo patient1 = new PatientInfo();
            patient1.name = "John";
            patient1.lastName = "Smith";
            patient1.age = 64;
            patient1.dateOfBirth = "May,05,1955";
            patient1.gender = "Male";
            patient1.treatmentDuration = 3.4;

            PatientInfo patient2 = new PatientInfo();
            patient2.name = "Alexander";
            patient2.lastName = "Johanson";
            patient2.age = 60;
            patient2.dateOfBirth = "March,05,1960";
            patient2.gender = "Male";
            patient2.treatmentDuration = 6.5;

        patient1.recovering();
        patient2.notrecovering();
//        patient2.recovering();

    }

}
