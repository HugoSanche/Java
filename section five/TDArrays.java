
public class TDArrays {
    public static void main(String[] Args){
        int[][] grades={
                        {30,45,85,23},
                        {45,81,10,63},
                        {74,05,37,96}
                        };
        for (int i=0; i<grades.length; i++){
            
            switch(i){
                case 0: System.out.print("Hugo ");
                        break;
                case 1: System.out.print("Karina ");
                        break;
                case 2: System.out.print("Veronica ");
                        break;
                default: System.out.print("Others ");

            }
            for (int j=0; j<grades[i].length; j++){
                System.out.print(grades[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}

