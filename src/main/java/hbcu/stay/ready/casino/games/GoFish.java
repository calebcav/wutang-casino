package hbcu.stay.ready.casino.games;
import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.utilities.Console;

public class GoFish extends CardGame {



    public GoFish(Console console, Player playerOne){
        super(console, playerOne);
    }


    public void playGame() {

    }

    public String info() {
        return "Go Fish!";
    }
}
