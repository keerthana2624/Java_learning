import java.util.Scanner;

public class Tic_Tac_Toe {

    private static final int size=3;
    private static final char user1='x';
    private static final char user2='o';


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
               if(col<size-1)System.out.print('|');
            }
            System.out.println();
            }
    }
    
    
    private void makeMove(){
        Scanner s = new Scanner(System.in);
        System.out.println("this is "+currentplayer+" turn");
        
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
        // System.out.println("current player changed to next user");
    }

    private boolean checkWin(){
        for(int row=0;row<size;row++){
            if (tictacboard[row][0]==currentplayer && tictacboard[row][1]==currentplayer && tictacboard[row][2]==currentplayer){
                return true;
            }
        }
        for(int col=0;col<size;col++){
            if (tictacboard[0][col]==currentplayer && tictacboard[1][col]==currentplayer && tictacboard[2][col]==currentplayer){
                return true;
            }
        }

        if (tictacboard[0][0]==currentplayer && tictacboard[1][1]==currentplayer && tictacboard[2][2]==currentplayer){
            return true;
        }

        if (tictacboard[0][2]==currentplayer && tictacboard[1][1]==currentplayer && tictacboard[2][0]==currentplayer){
            return true;
        }
        return false;
    
    }

    private boolean checkTie(){
        for(int row=0;row<size;row++){
            for (int col=0;col<size;col++){
                if (tictacboard[row][col]=='-'){
                    return false;

                }
            }
        }
        return true;
       
    }


    private void playgame(){
        while (true) {
            makeMove();
            displayboard();
            if (checkWin()){
                System.out.println("player "+currentplayer+" wins!");
                break;
            } else if (checkTie()){
                System.out.println("game is tie!");
                break;

            } else {
                switchPlayer();
            }
        }
    }

    public static void main(String[] args) {
        Tic_Tac_Toe tic=new Tic_Tac_Toe();
        tic.playgame();
    
        }
}

