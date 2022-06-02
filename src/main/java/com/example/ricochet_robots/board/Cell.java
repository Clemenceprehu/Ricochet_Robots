package com.example.ricochet_robots.board;

public class Cell {
    private Integer walls; //position of walls starts west side
    private ObjectiveColor objectiveColor;
    private boolean corner;

    public Cell(Integer walls, ObjectiveColor objectiveColor) {
        this.walls = walls;
        this.objectiveColor = objectiveColor;
    }

    public Integer getWalls() {
        return walls;
    }

    public void setWalls(Integer walls) {
        this.walls = walls;
    }

    public ObjectiveColor getObjectiveColor() {
        return objectiveColor;
    }

    public void setObjectiveColor(ObjectiveColor objectiveColor) {
        this.objectiveColor = objectiveColor;
    }

    public boolean isCorner() {
        return corner;
    }

    public void setCorner(boolean corner) {
        this.corner = corner;
    }


}