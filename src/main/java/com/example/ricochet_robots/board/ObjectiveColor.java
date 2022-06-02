package com.example.ricochet_robots.board;

public enum ObjectiveColor {
    Red("R"), Blue("B"), Green("G"), Yellow("Y"), None("N");

    public final String label;
    ObjectiveColor(String label) {
        this.label = label;
    }
}
