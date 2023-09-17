import java.util.Scanner;

class Player {
    public String symbol;
    private int score = 0;
    private String playerName;

    public Player(String _symbol) {
        symbol = _symbol;
    }

    public void Move(Grid grid){
        int move;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Хiд " + playerName + ":");
        move = myObj.nextInt();
        grid.ChangeGrid(move - 1, this);
    }
    public String GetName(){
        return playerName;
    }
    public void InputName(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Гравець " + symbol + ", введiть ваше iм'я:");
        playerName = myObj.next();
    }
    public int GetScore(){
        return score;
    }
    public void IncScore(){
        score += 1;
    }
}
