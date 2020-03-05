package digitalBookstore;


import java.util.*;

public class Users implements Methods {

    public static Map<Integer, Users> users = new HashMap<>();

    public Users() {

    }

    Set<Integer> keySet = users.keySet();
    Collection<Users> values = users.values();


    public static String name;
    public static int dateOfBirth;
    public static int phoneNumber;


    public Users(String name, int dateofBirth, int phoneNumber) {

        this.name = name;
        this.dateOfBirth = dateofBirth;
        this.phoneNumber = phoneNumber;

    }


    private void setName(String name) {
        this.name = name;
    }

    private void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private void setPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString1() {
        return name;
    }

    @Override
    public String toString() {
        return name + "; Data urodzenia: " + dateOfBirth + ";  Numer tel.:  " + phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return dateOfBirth == users.dateOfBirth &&
                phoneNumber == users.phoneNumber &&
                name.equals(users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, phoneNumber);
    }


    public static Map<Integer, Users> getUsers() {
        return users;
    }

    @Override
    public void updateUser(String a, Integer b, Integer c) {
        Scanner scan = new Scanner(System.in);
        int userId = scan.nextInt();
        Users user = users.get(userId);
        System.out.println("Podaj kolejne dane:");
        System.out.println("Aktualizuj imię i nazwisko:");
        String x = scan.nextLine();
        user.setName(x);
        System.out.println("Aktualizuj datę urodzenia:");
        int x1 = scan.nextInt();
        user.setDateOfBirth(x1);
        System.out.println("Aktualizuj numer telefonu:");
        int x2 = scan.nextInt();
        user.setPhone(x2);
        System.out.println("Oto Twoje zmienione dane: " + users.get(userId));
    }


    @Override
    public void createNewUser(String a, Integer b, Integer c) {
        System.out.println("Podaj kolejne dane:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź imię i nazwisko:");
        Users user = new Users(name, dateOfBirth, phoneNumber);
        String x = scan.nextLine();
        user.setName(x);
        System.out.println("Wprowadź datę urodzenia:");
        int x1 = scan.nextInt();
        user.setDateOfBirth(x1);
        System.out.println("Wprowadź numer telefonu:");
        int x2 = scan.nextInt();
        user.setPhone(x2);
        System.out.println("Wprowadź nowe ID, podając liczbę od 1000 - 9000");

        int id = scan.nextInt();
        if (users.containsKey(id)) {
            System.out.println("Podaj inny numer");
            scan.nextInt();
        } else if (users.containsKey(id)) {
            System.out.println("Podaj inny numer");
            scan.nextInt();
        } else if (!users.containsKey(id)) {
            users.put(id, user);
            System.out.println("Oto Twoje dane: " + users.get(id).toString());
        } else System.out.println(" Niepoprawny numer ");

    }

    @Override
    public void pay() {

    }

    @Override
    public void buyAdultBooks() {

    }

    @Override
    public void buyChildrenBooks() {

    }

    @Override
    public void addToBasket(Object o) {

    }

    //    @Override
//    public boolean equals(Object obj) {
//
//        if (obj == this) return true;
//        if (!(obj instanceof Users))
//            return false;
//        Users user = (Users) obj;
//
//        return user.name == name &&
//                user.dateOfBirth == dateOfBirth &&
//                user.phone == phone;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Integer.hashCode(Integer.parseInt(name));
//        result = (31 * result) + Integer.hashCode(dateOfBirth);
//        result = (31 * result) + Integer.hashCode(phone);
//        return result;
//    }

}



