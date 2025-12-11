package _throw;


//Role of the throw key word
public class Employee {
    private Integer age;

    public void validateAge(Integer age){
        if (age<0){
            throw new IllegalArgumentException("Age is less than 0");
        }
    }

    public static void main(String[] args) {
        Employee employee =new Employee();
        try {
            employee.validateAge(-5);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
