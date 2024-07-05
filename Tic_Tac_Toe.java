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

    }

    public static void main(String[] args) {
        Tic_Tac_Toe tic=new Tic_Tac_Toe();
        tic.displayboard();
    }
}
