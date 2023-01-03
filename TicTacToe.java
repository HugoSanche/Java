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
  int o=0;
  for (int i=0; i<array.length; i++){
  
    for (int j=0; j<array.length; j++){
      if (array[i][j]=='X')
      {
         x=+1;
      }
      if (array[i][j]=='O')
      {
        o=+1;
      }
    }
    if (x==3){
      count= 3;
    }
    else if (o==3){
      count= -3;
    }
 
    x=0;
    o=0;
  }
  return count;
}
}
/* 
  if (array[0][0]==('X') && array[0][1]==('X') && array[0][2]==('X')){
    System.out.println("X wins");
  }
  if (array[0][0]==('O') && array[0][1]==('O') && array[0][2]==('O')){
    System.out.println("O wins");
  }
 //Column 1
 if (array[1][0]==('X') && array[1][1]==('X') && array[1][2]==('X')){
  System.out.println("X wins");
}
if (array[1][0]==('O') && array[1][1]==('O') && array[1][2]==('O')){
  System.out.println("O wins");
}
 //Column 2
 if (array[2][0]==('X') && array[2][1]==('X') && array[2][2]==('X')){
  System.out.println("X wins");
}
if (array[2][0]==('O') && array[2][1]==('O') && array[2][2]==('O')){
  System.out.println("O wins");
}
return count;
}
*/

