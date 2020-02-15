package src.digitalBookstore;

public class Users {

    private  String name;
    private int dateOfBirth;
    private  int phone;



    public Users(String name, int dateofBirth, int phone ) {

        this.name = name;
        this.dateOfBirth = dateofBirth;
        this.phone = phone;

    }

public static Users user1 = new Users(  "Piotr Tomaszewski",    2009 ,  89566660);
   static  Users user2 = new Users(  "Robert Morela",    1970 ,  89000077);
    static Users user3 = new Users(  "Laura Collins",    1980 ,  89090004);
    static Users user4 = new Users(  "Alice Collins",    1950 ,  77090004);


    @Override
    public String toString() {
        return name + "  " + dateOfBirth +  "  " + phone;
    }



    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (!(obj instanceof Users))
            return false;
            Users user = (Users) obj;

            return user.name==name &&
                    user.dateOfBirth== dateOfBirth &&
                    user.phone==phone;

        }

    @Override
    public  int hashCode() {
        int result = Integer.hashCode(Integer.parseInt(name));
        result = 31 * result + Integer.hashCode(dateOfBirth);
        result = (31 * result) + Integer.hashCode(phone);
        return result;
    }


}

