import consumer.specific.ChildClass;
import dev.lpa.generics.BaseClass;

public class Main {
    public static void main(String[] args) {
        BaseClass parent=new BaseClass();
        ChildClass child =new ChildClass();
        BaseClass childReferredToAsBase=new ChildClass();

        parent.recommendedMethod();
        System.out.println("--------------------------");
        childReferredToAsBase.recommendedMethod();
        System.out.println("--------------------------");
        child.recommendedMethod();
    }
}