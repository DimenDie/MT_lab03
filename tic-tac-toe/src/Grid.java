public class Grid {
    String[] grid = new String[9];

    public void ShowCurrentGrid(){
        System.out.println("-------------");
        System.out.println("| " + grid[0] + " | " + grid[1] + " | " + grid[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + grid[3] + " | " + grid[4] + " | " + grid[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + grid[6] + " | " + grid[7] + " | " + grid[8] + " |");
        System.out.println("-------------");
    }
    public void StartGrid(){
        
        for (int a = 0; a < 9; a++) {
            grid[a] = String.valueOf(a + 1);
        }
    }

    public void ChangeGrid(int move, Player player){
        if((grid[move].toString() == "X") || grid[move].toString() == "O"){
            System.out.println("Це мiсце вже зайняте");
            init.numInput--;
           return;
        }
        grid[move] = player.symbol;
    }

    public void CheckWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = grid[0] + grid[1] + grid[2];
                break;
            case 1:
                line = grid[3] + grid[4] + grid[5];
                break;
            case 2:
                line = grid[6] + grid[7] + grid[8];
                break;
            case 3:
                line = grid[0] + grid[3] + grid[6];
                break;
            case 4:
                line = grid[1] + grid[4] + grid[7];
                break;
            case 5:
                line = grid[2] + grid[5] + grid[8];
                break;
            case 6:
                line = grid[0] + grid[4] + grid[8];
                break;
            case 7:
                line = grid[2] + grid[4] + grid[6];
                break;
            }
            if (line.equals("XXX")) {
                init.gameEnded = true;
                init.player1.IncScore();;
                System.out.println(init.player1.GetName() + " виграв.");
            }
              
            else if (line.equals("OOO")) {
                init.gameEnded = true;
                init.player2.IncScore();;
                System.out.println(init.player2.GetName() + " виграв.");
            }
        }
    }
}
