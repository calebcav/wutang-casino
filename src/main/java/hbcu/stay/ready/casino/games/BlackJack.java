package hbcu.stay.ready.casino.games;

import hbcu.stay.ready.casino.GamblingGame;
import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.utilities.Console;

public class BlackJack extends CardGame implements GamblingGame {

    public BlackJack(Console console, Player playerOne) {
        super(console, playerOne);
    }

    public boolean canGamble() {
        return false;
    }

    public void playGame() {

    }

    public String info() {
        return "BlackJack";
    }



}
