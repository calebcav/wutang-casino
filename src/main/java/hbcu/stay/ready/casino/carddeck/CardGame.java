package hbcu.stay.ready.casino.carddeck;
import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.games.Game;
import hbcu.stay.ready.casino.utilities.Console;

public abstract class CardGame implements Game {

    private Player dealer;

    private Player playerOne;

    protected Console console;



    public CardGame(Console console, Player playerOne){
        this.console = console;
        this.playerOne = playerOne;

        dealer = new Player("Dealer");
    }




}
