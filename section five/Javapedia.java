import java.util.Scanner;

public class Javapedia {
   
    public static void main(String[] Args){
        Scanner scan =new Scanner(System.in);

        System.out.print("How many historical figures will you register?");
        int figures=scan.nextInt();

        String[][] array= new String[figures][3];

        scan.nextLine();
        for (int i=0; i<array.length; i++){
            System.out.println("\n \t Figure: "+(i+1));
            System.out.print("\t - Name: ");
            array[i][0]=scan.nextLine();
            System.out.print("\t - Date of Birth: ");
            array[i][1]=scan.nextLine();
            System.out.print("\t - Occupation: ");
            array[i][2]=scan.nextLine();
            System.out.print("");

        }

        print2DArray(array);
    }
    public static void print2DArray(String[][] array){
        Scanner scan =new Scanner(System.in);
        for (int i=0; i<array.length; i++){
            System.out.println("\t");
            for (int j=0; j<array[i].length; j++){
                switch (j){
                    case 0: System.out.print("\t - Name: ");
                        break;
                    case 1: System.out.print("\t - Date of birth: ");
                        break;
                    case 2:System.out.print("\t - Occupation: ");
                        break;
                    default:
                        System.out.println("\t Others: ");
                }
                System.out.println(array[i][j]);
            }
            System.out.println("\n"); 
        }
        System.out.println("These are the values you stored:");
        
        for (int i=0; i<array.length; i++){
            System.out.print("\t");
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.print("\n");
        }
        
       System.out.println("Who do you want information on?");
       String name=scan.nextLine();
       System.out.println("\n");
        for (int i=0; i<array.length; i++){
          
            if (array[i][0].equalsIgnoreCase(name)){
                System.out.println("\t Name: "+array[i][0]+" ");
                System.out.println("\t Date of Birth: "+array[i][1]+" " );
                System.out.println("\t Occupation: "+array[i][2]+" ");
            }
        }
    }
}
