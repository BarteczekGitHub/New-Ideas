The attached code represents the first part of my API for buying books. The project consists of three classes:

1. Users; 2.Books; 3.Main. In public class Main there are: Already initialized HashMaps:

 "Map<Integer, Users> users"  that keeps number and user;
 "Map<Integer, List<Books>> books" that keeps number and arraylist with books;
and instances to keep future books and their prices picked by a customer:

 List<Object> listBasket 
 List<Double> listPrices 
 Double[] prices = new Double[10];
I created specific methods that are being envoked by a customer - while shopping - ( new or existing user ) by typing in appropriate numbers that are read by the Scanner class in terminal.

buyAdultBooks(); buyChildrenBooks(); createNewUser(); updateUser(); addToBasket(); pay();
