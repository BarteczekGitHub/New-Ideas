package digitalBookstore;


import java.util.*;

public class Books implements Methods {

    public static List<Object> listBasket = new ArrayList<>();
    public static List<Double> listPrices = new ArrayList<>();
    public static Double[] prices = new Double[10];

    private int id;
    private String title;
    private String author;
    private int numberOfPages;
    private double price;
    private Object o;


    public Books(int id, String title, String author, int numberOfPages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public Books() {

    }

    public static Books book_A001 = new Books(10, "Komu bije dzwon", "Ernest Hemingway", 300, 25.90);
    public static Books book_A002 = new Books(20, "Charyzmatyk", "Bartosz Geisler", 305, 35.90);
    public static Books book_A003 = new Books(30, "Bez pożegnania", "Harlan Coben", 280, 27.90);

    public static Books book_C001 = new Books(40, "Małe kobietki", "Louisa May Alcott", 200, 20.90);
    public static Books book_C002 = new Books(50, "Ania z Zielonego Wzgórza", " Lucy Maud Montgomery", 260, 35.90);
    public static Books book_C003 = new Books(60, "Tytus, Romek i Atomek - Księga XII ", "Henryk Jerzy Chmielewski", 30, 15.90);


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    static List<Books> adultBooks = Arrays.asList(book_A001, book_A002, book_A003);
    static List<Books> childrenBooks = Arrays.asList(book_C001, book_C002, book_C003);


    public double toString2() {
        return price;
    }

    @Override
    public String toString() {
        return "Id: " + id + ";  Tytuł: " + title + ";  Autor: " + author + ";  Ilość stron: " + numberOfPages + ";  Cena: " + price + "  PLN" + "\n";
    }


    @Override
    public void updateUser(String a, Integer b, Integer c) {

    }

    @Override
    public void createNewUser(String a, Integer b, Integer c) {

    }

    @Override
    public void pay() {
        System.out.println("Oto Twoje zamówienie: " + listBasket.toString());
        System.out.println("Teraz możesz już użyć swojej złotej karty kredytowej.");
        System.out.println("Jeśli chcesz wrócić do zakupów i kupić książkę dla dorosłych wpisz '2', a jeśli dLa dzieci wpisz '3' ");
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        if (z == 2) {
            buyAdultBooks();
        }
        if (z == 3) {
            buyChildrenBooks();
        }
    }


    @Override
    public void buyAdultBooks() {
        Scanner scan = new Scanner(System.in);
        System.out.println(adultBooks.toString());
        System.out.println("Wybierz numer książki, by dodać do koszyka.");
        int z = scan.nextInt();
        if (z == 10) {
            addToBasket(book_A001);
            listPrices.add(book_A001.getPrice());
            prices = new Double[]{book_A001.getPrice()};
            System.out.println("Jeśli chcesz przejść do płatności naciśnij: 1 ");
            int w = scan.nextInt();
            if (w == 1) {

                System.out.println("RAZEM w koszyku do zapłaty: ");
                for (int price = 0; price < listPrices.size(); price++) {
                    System.out.println(listPrices.get(price));

                }
                pay();
            }


        }


        if (z == 20) {
            addToBasket(book_A002);
            listPrices.add(book_A002.getPrice());
            System.out.println("Jeśli chcesz przejść do płatności naciśnij: 1 ");
            int w = scan.nextInt();
            if (w == 1) {

                System.out.println("RAZEM w koszyku do zapłaty: ");
                for (Object price : listPrices) {
                    System.out.println(price);
                }
                pay();
            }

        }
        if (z == 30) {
            addToBasket(book_A003);
            listPrices.add(book_A003.getPrice());
            System.out.println("Jeśli chcesz przejść do płatności naciśnij: 1 ");

            int w = scan.nextInt();
            if (w == 1) {

                System.out.println("RAZEM w koszyku do zapłaty: ");

                for (int price = 0; price < listPrices.size(); price++) {
                    System.out.println(listPrices.get(price));
                }
                pay();
            }

        }
    }

    @Override
    public void buyChildrenBooks() {

        System.out.println(childrenBooks.toString());
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz numer książki, by dodać do koszyka.");
        int z1 = scan.nextInt();
        if (z1 == 40) {
            addToBasket(book_C001);
            listPrices.add(book_C001.getPrice());
            prices = new Double[]{book_C001.getPrice()};
            System.out.println("Jeśli chcesz przejść do płatności naciśnij: 1 \nJeśli chcesz kupić książkę dla dorosłych wpisz : '2' \nJeśli dLa dzieci wpisz: '3'");

            int w = scan.nextInt();
            if (w == 1) {
                pay();
                System.out.println("RAZEM w koszyku do zapłaty: ");

                for (int price = 0; price < listPrices.size(); price++) {
                    System.out.println(listPrices.get(price));
                }

            }
            if (w == 2) {
                buyAdultBooks();
            }
            if (w == 3) {
                buyChildrenBooks();
            }
        }

        if (z1 == 50) {
            addToBasket(book_C002);
            listPrices.add(book_C002.getPrice());
            System.out.println("Jeśli chcesz przejść do płatności naciśnij: 1 \nJeśli chcesz kupić książkę dla dorosłych wpisz : '2' \nJeśli dLa dzieci wpisz: '3'");

            int w = scan.nextInt();
            if (w == 1) {
                pay();
                System.out.println("RAZEM w koszyku do zapłaty: ");
                for (Object price : listPrices) {
                    System.out.println(price);
                }
            }

            if (w == 2) {
                buyAdultBooks();
            }
            if (w == 3) {
                buyChildrenBooks();
            }
        }
        if (z1 == 60) {
            addToBasket(book_C003);
            listPrices.add(book_C003.getPrice());
            System.out.println("Jeśli chcesz przejść do płatności naciśnij: 1 \nJeśli chcesz kupić książkę dla dorosłych wpisz : '2' \nJeśli dLa dzieci wpisz: '3'");

            int w = scan.nextInt();
            if (w == 1) {
                pay();
                System.out.println("RAZEM w koszyku do zapłaty: ");

                for (int price = 0; price < listPrices.size(); price++) {
                    System.out.println(listPrices.get(price));
                }

            }
            if (w == 2) {
                buyAdultBooks();
            }
            if (w == 3) {
                buyChildrenBooks();

            }
        }
    }

    @Override
    public void addToBasket(Object o) {
        listBasket.add(o);
    }
}



