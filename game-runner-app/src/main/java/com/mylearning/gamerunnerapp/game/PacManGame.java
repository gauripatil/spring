package com.mylearning.gamerunnerapp.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
    public void up() {
        System.out.println("PacMan jump");
    }

    public void down() {
        System.out.println("PacMan down into hole");
    }

    public void left() {
        System.out.println("PacMan stop");
    }

    public void right() {
        System.out.println("PacMan accelerate");
    }
}
