package digitalBookstore;

import java.util.*;

import static digitalBookstore.Books.*;
import static digitalBookstore.Users.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Users> users = new HashMap<>();
        Map<Integer, List<Books>> books = new HashMap<>();
        List<Object> listBasket = new ArrayList<>();
        List<Double> listPrices = new ArrayList<>();

        Methods method1 = new Users();
        Methods method2 = new Users();
        Methods method3 = new Books();
        Methods method4 = new Books();

        Users user1 = new Users("Piotr Tomaszewski", 1997, 89566660);
        Users user2 = new Users("Robert Morela", 1980, 89000077);
        Users user3 = new Users("Laura Collins", 1980, 89090004);
        Users user4 = new Users("Maciej Boguszewicz", 1984, 77090004);

        users.put(1001, user1);
        users.put(3001, user2);
        users.put(2001, user3);
        users.put(5001, user4);

//        System.out.println(users.get(3001));
//        Set<Integer> keySet = users.keySet();
//        Collection<Users> values = users.values();
//        System.out.println(keySet);
//        System.out.println(values);

        books.put(1, adultBooks);
        books.put(2, childrenBooks);

        Scanner scan = new Scanner(System.in);

        System.out.println("Witaj w DIGITAL BOOKSTORE !");
        System.out.println("Jeśli chcesz się zalogować, wpisz  '0'  i naciśnij Enter ");
        System.out.println("Jeśli chcesz zmienić swoje dane osobowe, w tym celu wpisz '1' i naciśnij ENTER." +
                " \nUwaga. Powyższa funkcja chwilowo niedostępna. Trwają prace serwisowe");
        System.out.println("Jeśli chcesz zapisać się do  DIGITAL BOOKSTORE, naciśnij '11'  i ENTER");

        int x = scan.nextInt();

        if (x == 0) {
            System.out.println("Wpisz numer swojego ID i naciśnij Enter \nDla potrzeb testu wpisz: 1001 ");
            int y = scan.nextInt();
            if (users.containsKey(y) == true) {
                System.out.println("ID potwierdzone! Witaj w sklepie: " + users.get(y).toString());
            }
            try {

            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                // ignoring wrong token
                scan.next();
            }
        }

        if (x == 1) {
            System.out.println("Wpisz kolejno : numer swojego ID i naciśnij  ENTER  \nDo testu przyjmij 1001");
            method1.updateUser(name, dateOfBirth, phoneNumber);
            System.out.println("Jeśli chcesz kupić książkę dla dorosłych wpisz '2', a jeśli dla dzieci wpisz '3' ");
        }

        if (x == 11) {
            method2.createNewUser(name, dateOfBirth, phoneNumber);
        }
// CASE 1: KLIENT WYBRAŁ KSIĄŻKI DLA DDOROSŁYCH :
        System.out.println("Jeśli chcesz kupić książkę dla dorosłych wpisz '2', a jeśli da dzieci wpisz '3' ");
        int y = scan.nextInt();
        if (y == 2) {
            method3.buyAdultBooks();
        }
// CASE 2 : KLIENT WYBRAŁ KSIĄŻKI DLA DZIECI :
        if (y == 3) {
            method4.buyChildrenBooks();
        }
    }


}
// System.out.println(users.toString());
// System.out.println("Klucze  to: \n" + keySet.toString() + " ; \n" +
//        " Użytkownicy to: \n " + values.toString());
// for (Map.Entry<Integer, Users> entry : users.entrySet()) {
//   System.out.println("Klucz  nr: " + entry.getKey().toString() + " : " + "Użytkownik : " + entry.getValue().toString());
// }
//  System.out.println( listBasket.size());
//  int s=listBasket.size();
// System.out.println( listBasket.get(s-1));
// System.out.println( book_A001.getPrice() );