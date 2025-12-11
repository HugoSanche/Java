import java.util.Arrays;

public class Test {
    public static void main(String[] Args){
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
 
        String[] moreItems = Arrays.copyOf(items, 2);
        items[1] = "sofa";

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(moreItems));
    }
}