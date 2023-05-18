package com.mylearning.gamerunnerapp.game;

public class GameRunner {

    private GamingConsole game;
    // GameRunner is tightly coupled to SuperCOntraGame now.
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
