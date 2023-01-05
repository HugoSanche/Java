import java.util.Scanner;
public class TicTacToe {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println("\nLet's play tic tac toe");
            //Task 1: Create an array with three rows of '_' characters.
            char[][] ticTac={{'_','_','_'},
                                {'_','_','_'},
                                {'_','_','_'}
                              };
            //Task 2: Call the function printBoard();
             printBoard(ticTac);
                  for (int i=0; i<=8; i++){
                    if (i%2==0){
                      System.out.println("Turn X: ");
                     int[] spot= askUser(ticTac);
                     ticTac[spot[0]][spot[1]]='X';
                     
                    }
                    else{
                      System.out.println("Turn O: ");
                     int[] spot=  askUser(ticTac);
                     ticTac[spot[0]][spot[1]]='O';
                      
                    }
                    printBoard(ticTac);
                    int res =checkWin(ticTac);
                    if (res==3)
                      {
                        System.out.println("X wins");
                        break;
                      }
                      else if (res==-3){
                        System.out.println("O wins");
                        break;
                      }
                  }
                /*
                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */
             
            scan.close();
        }
     

public static void printBoard(char array[][]){
  System.out.println("");
  for (int i=0; i<array.length;i++){
      System.out.print("\t");
      for (int j=0; j<array[i].length;j++){
        System.out.print(array[i][j]+" ");
      }
      System.out.println("\n");
  }
}

public static int[] askUser(char[][] board){

  System.out.println("pick a row and column number: ");
  int resRow=scan.nextInt();
  int rescolumn=scan.nextInt();
  while (board[resRow][rescolumn]!='_'){
    System.out.println("row "+resRow+" column "+rescolumn+" are in use, select other ");
    resRow=scan.nextInt();
    rescolumn=scan.nextInt();
  }
return new int[]{resRow,rescolumn};
}

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
public static int checkWin (char[][] array){
  int count=0;
  //Column 0
 
  int x=0;
  int y0=0;
  int y1=0;
  int y2=0;

  for (int i=0; i<array.length; i++){
  
    for (int j=0; j<array.length; j++){
      if (array[i][j]=='X')
      {
         x++;
      }
      if (array[i][j]=='O')
      {
        x--;
      }

      //0 X
      if (array[i][0]=='X'){
        y0++;
        System.out.println(" uno ");
      }
      //0 O
      if (array[i][0]=='O'){
        y0--;
      }

       //1 X
       if (array[i][1]=='X'){
        y1++;
      }
      //1 O
      if (array[i][1]=='O'){
        y1--;
      }

      //2 X
      if (array[i][2]=='X'){
        y2++;
      }
      //2 O
      if (array[i][2]=='O'){
        y2--;
      }    

    }
    if (x==3 || y0==3 || y1==3 || y2==3){
      count= 3;
      System.out.println("Error x "+x +" y0 "+y0 +" y1 "+y1+" y2 "+y2);
    }
    else if (x==-3 || y0==-3 || y1==-3 || y2==-3){
      count= -3;
    }
    x=0;
  }
  return count;
}
}


