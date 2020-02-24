package digitalBookstore;


import java.util.Objects;

public class Users {

    private String name;
    private int dateOfBirth;
    private int phone;


    public Users(String name, int dateofBirth, int phone) {

        this.name = name;
        this.dateOfBirth = dateofBirth;
        this.phone = phone;

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String toString1() {
        return name;
    }

    @Override
    public String toString() {
        return name + "; Data urodzenia: " + dateOfBirth + ";  Numer tel.:  " + phone;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return dateOfBirth == users.dateOfBirth &&
                phone == users.phone &&
                name.equals(users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, phone);
    }
}

