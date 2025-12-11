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
                      else if (i==8){
                        System.out.println("Its a tie!");
                      }
                  }
  
             
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
  
  int x=0;
//check horizontal winner
  for (int i=0; i<array.length; i++){  
    for (int j=0; j<array[i].length; j++){
      if (array[i][j]=='X')
      {
         x++;
      }
      if (array[i][j]=='O')
      {
        x--;
      }
    }
    if (x==3 || x==-3){
      return x;
    }
    else {
      x=0;
    }
  }
x=0;
//check diagonal winner
  for (int i=0; i<array.length; i++){
    for (int j=0; j<array[i].length; j++){
      if (array[j][i]=='X')
      {
         x++;
      }
      if (array[j][i]=='O')
      {
        x--;
      }
    }
    if (x==3 || x==-3){
      return x;
    }
    else {
      x=0;
    }
  }
  x=0;
  //check diagonal left diagonal 
  for (int i=0; i<array.length; i++){
        //System.out.println(" Diagonal i "+i+" j "+ j);
        if (array[i][i]=='X')
        {
          x++;
        }
        if (array[i][i]=='O')
        {
          x--;
        }
  }
  if (x==3 || x==-3){ 
    return x;
  } 
x=0;

//check rigth diagonal winner
for (int i=0; i<array.length; i++){

    if (array[i][2-i]=='X')
    {
       x++;
    }
    if (array[i][2-i]=='O')
    {
      x--;
    }
}
if (x==3 || x==-3){
  return x;
}
else {
  x=0;
}
  return x;
}
}


