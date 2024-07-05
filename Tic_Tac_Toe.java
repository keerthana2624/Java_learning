import java.util.Scanner;


public class Tic_Tac_Toe {

    private static final int size=3;
    private static final char user1='x';
    private static final int user2='o';


    private char[][] tictacboard;
    private char currentplayer;

    public Tic_Tac_Toe(){
        initializeBoard();
        currentplayer=user1;

    }

    private void initializeBoard(){
        tictacboard = new char[size][size];
        for(int row=0;row<size;row++){
            for (int col=0;col<size;col++){
                tictacboard[row][col]='-';
            }
        }
    }

    private void displayboard(){
        for(int row=0;row<size;row++){
            for (int col=0;col<size;col++){
               System.out.print(tictacboard[row][col]);
            }
            System.out.println();
        }
    }
    
    private void makeMove(){
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("enter the row: ");
            int row=s.nextInt();
            System.out.println("enter the col: ");
            int col=s.nextInt();
            if (row > size){
                System.out.println("row index out of range! please try again");
            }
            if (col > size){
                System.out.println("col index out of range! please try again");

            } 

            if (tictacboard[row][col]=='-'){
                tictacboard[row][col]=currentplayer;
                switchPlayer();
                break;
            } else {
                System.out.println("already that position is full");
            }
        }
        
    }
    


    private void switchPlayer(){
        if (currentplayer==user1){
            currentplayer=user2;
        } else {
            currentplayer=user1;
        }
        System.out.println("current player changed to next user");
    }

    private checkWin(){
        

    }
    public static void main(String[] args) {
        Tic_Tac_Toe tic=new Tic_Tac_Toe();
        tic.displayboard();
        tic.makeMove();
        tic.switchPlayer();
    
        }

       

}

