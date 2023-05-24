package com.mylearning.gamerunnerapp.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    // Constructor based injection
    @Autowired
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
