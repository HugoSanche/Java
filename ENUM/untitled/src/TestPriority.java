public class TestPriority {

    public void showPriority(Priority priority){
        switch (priority){
            case LOW:
                System.out.println("LOW");
                break;
            case MEDIUM:
                System.out.println("Medium");
                break;
            case HIGH:
                System.out.println("Heigh");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
    public static void main(String[] args) {
        TestPriority testPriority=new TestPriority();
        Priority test =Priority.LOW;
        testPriority.showPriority(test);

    }
}
