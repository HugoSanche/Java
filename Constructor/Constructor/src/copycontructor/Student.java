package copycontructor;


//Se usan cuando ya tienes un objecto con muchos datos y desas crear otro objecto igual y asi no tener que volver a llenar los datos
 //del mismo objecto
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }
    //copy constructor: Es used to create a new object as a copy of an existing object.
    //                  typically accepts an instance of the same class as a parameter.
    public Student(Student student){
        this.name=student.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student1=new Student("Hugo");

        //mandas los valores de student1 a student2
        Student student2= new Student(student1);


        System.out.println(student1.name);
        System.out.println(student2.name);

    }
}
