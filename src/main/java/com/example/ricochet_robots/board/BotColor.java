package com.example.ricochet_robots.board;

public enum BotColor {

    Red("R"), Blue("B"), Green("G"), Yellow("Y"), None("N");
    public final String label;
    BotColor(String label) {
        this.label = label;
    }
}
