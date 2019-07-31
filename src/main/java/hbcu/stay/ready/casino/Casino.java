package hbcu.stay.ready.casino;


import hbcu.stay.ready.casino.games.BlackJack;
import hbcu.stay.ready.casino.games.Game;
import hbcu.stay.ready.casino.games.GoFish;
import hbcu.stay.ready.casino.utilities.Console;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Casino {

    private ArrayList<Game> games;
    private Console console;
    private Player player1;

    public Casino(InputStream in, PrintStream out){
        this.console = new Console(in,out);
        this.games = new ArrayList<Game>();
        initGames();
    }

    private void initGames(){
        String name = console.getStringInput("What is your name?");
        player1 = new Player(name);
        games.add(new BlackJack(console, player1));
        games.add(new GoFish(console, player1));
    }

    public void start(){
        boolean keepPlaying = true;
        while(keepPlaying){
            console.println("Here is a list of games:");
            int index = 0;
            for(Game game:games){
                console.println(index +") " + game.info());
                index++;
            }
            console.println(index +") Quit");
            int selection = console.getIntegerInput("What number game do you want");
            if(selection < games.size())
                games.get(selection).playGame();
            else if (selection == games.size()) {
                keepPlaying = false;
                console.println("Good Bye");
            }
            else
                console.println("Nah son");
        }

    }

    public static void main(String[] args) {
        Casino casino = new Casino(System.in, System.out);
        casino.start();
    }
}