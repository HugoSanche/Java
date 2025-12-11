public class BreakAndContinue {
    public static void main(String[] Args){

        //working with continue
        for (int i=0;i<=10;i++){
            if (i % 2 !=0){
                continue;
            }
            System.out.println(i);
        }
        for (int i=10;i>0;i--){
            if (i % 2 !=0){
                break;
            }
            System.out.println(i);
        }

    }
}
