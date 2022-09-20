package List;

public class User {
    // Creates Variables for the information that we want, in this case Name & Number
    public String name;
    public int number;

    public User(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public User(String tagName) {
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getNumber() {
        return number;
    }

//    public void setNumber(int number) {
//        this.number = number;
//    }

    public String toString() {
        return number + ", " + name;
    }

}
