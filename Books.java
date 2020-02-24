package digitalBookstore;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books {

private int id;
    private String title;
    private String author;
    private int numberOfPages;
    private double price;


    public Books(int id, String title, String author, int numberOfPages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public static Books book_A001 = new Books(10,"Komu bije dzwon", "Ernest Hemingway", 300, 25.90 );
    public static Books book_A002 = new Books(20,"Charyzmatyk", "Bartosz Geisler", 305, 35.90 );
    public static Books book_A003 = new Books(30,"Bez pożegnania", "Harlan Coben", 280, 27.90 );

    public static Books book_C001 = new Books(40,"Małe kobietki", "Louisa May Alcott", 200, 20.90 );
    public static Books book_C002 = new Books(50,"Ania z Zielonego Wzgórza", " Lucy Maud Montgomery", 260, 35.90 );
    public static Books book_C003 = new Books(60,"Tytus, Romek i Atomek - Księga XII ", "Henryk Jerzy Chmielewski", 30, 15.90 );

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    static List<Books> adultBooks = Arrays.asList(book_A001,book_A002,book_A003);
   static List<Books> childrenBooks = Arrays.asList(book_C001,book_C002, book_C003);



    public  double toString2() {
        return price;
    }


    @Override
    public String toString() {
        return "Id: " + id + ";  Tytuł: " + title +  ";  Autor: " + author + ";  Ilość stron: " + numberOfPages + ";  Cena: " + price + "  PLN" + "\n";
        }
    }




