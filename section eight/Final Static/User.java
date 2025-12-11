public class User {

    private String firstName;
    private String lastName;
    private static int counter=0;
    public User(String firstName, String lastName) {
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static int getCounter(){
        return counter;
    }

}