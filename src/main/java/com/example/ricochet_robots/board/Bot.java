package com.example.ricochet_robots.board;

import java.awt.*;

public class Bot {

    private BotColor botcolor;
    private Point position;

    public Bot(BotColor botcolor, Point position) {
        this.botcolor = botcolor;
        this.position = position;
    }

    public BotColor getBotcolor() {
        return botcolor;
    }

    public void setBotcolor(BotColor botcolor) {
        this.botcolor = botcolor;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }


}
