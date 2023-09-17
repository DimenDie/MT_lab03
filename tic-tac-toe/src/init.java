import java.util.Scanner;
public class init {
    static Grid grid;
    static Boolean gameEnded;
    static Player player1;
    static Player player2;
    static int numInput;

    public static void main(String[] args) {
        player1 = new Player("X");
        player2 = new Player("O");
        grid = new Grid();
        
        player1.InputName();
        player2.InputName();
        while(true){
        gameEnded = false;
        grid.StartGrid();
        grid.ShowCurrentGrid();
        numInput = 0;
            while(!gameEnded){
                if(numInput % 2 == 0)
                    player1.Move(grid);
                else if(numInput % 2 == 1)
                    player2.Move(grid);
                numInput++;
                grid.ShowCurrentGrid();
                grid.CheckWinner();
                if(numInput == 9 && gameEnded != true){
                    System.out.println("Нiчия");
                    gameEnded = true;
                }
            }
            System.out.println(player1.GetName() + ":" + Integer.toString(player1.GetScore()));
            System.out.println(player2.GetName() + ":" + Integer.toString(player2.GetScore()));
        }
    }

}
