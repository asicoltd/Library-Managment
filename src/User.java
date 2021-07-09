public class User {
    private static int userNextId = 1000;
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    User( int id, String firstName, String lastName, String address, int age ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    User( String firstName, String lastName, String address ,int age ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }
    User( String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = 18;
    }

    @Override
    public String toString() {
        return "User id: " + id + "\n" +
                "User name: " + firstName + " " + lastName + "\n" +
                "Age :" + age+ "\n" +
                "Address :" + address;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getUserNextId() {
        return userNextId;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserNextId(int userNextId) {
        this.userNextId = userNextId;
    }
}
