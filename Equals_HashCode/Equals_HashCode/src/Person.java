public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
@Override
public boolean equals(Object obj){
        if (this!=obj){
            return false;
        }
        if (obj== null)
           {
            return false;
        }
        if (this.getClass()!=obj.getClass()){
            return false;
        }
        Person person=(Person) obj;

        if (!this.firstName.equals(((Person) obj).firstName) || !this.lastName.equals(((Person) obj).lastName)){
            return false;
        }
        return true;

}
@Override
public int hashCode(){
        int result=this.firstName.hashCode();
        result=31*result+this.lastName.hashCode();
        return result;
}


}
