
public class TDArrays {
    public static void main(String[] Args){
        int[][] grades={
                        {30,45,85,23},
                        {45,81,10,63},
                        {74,05,37,96}
                        };
        for (int i=0; i<grades.length; i++){
            System.out.println();
            for (int j=0; j<grades[i].length; j++){
                System.out.print(grades[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}

