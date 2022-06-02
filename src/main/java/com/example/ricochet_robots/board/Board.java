package com.example.ricochet_robots.board;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final HashMap<Point, Cell> board;
    private List<Bot> botList = new ArrayList<>();

    public Board(HashMap board) {
        this.board = board;
        initBoard();
    }

    public Map<Integer, Cell> getCellsLine(int n) {
        Map<Integer, Cell> tmpMap = new HashMap<>();
        for(int i=0; i<8; i++) {
            tmpMap.put(i, board.get(new Point(i, n)));
        }
        return tmpMap;
    }

    public Map<Integer, Cell> getCellsColumn(int m) {
        Map<Integer, Cell> tmpMap = new HashMap<>();
        for(int i=0; i<8; i++) {
            tmpMap.put(i, board.get(new Point(m, i)));
        }
        return tmpMap;
    }

    public Cell getCell(Integer x, Integer y) {
        Point tmpPoint = new Point(x, y);
        return board.get(tmpPoint);
    }

    public void setCell(Point tmpPoint, Cell tmpCell) {
        board.put(tmpPoint, tmpCell);
    }

    private void initBoard() {
        addSideWalls();
        addCorners();
        addBots();
        getBotPositions();
    }

    private void addSideWalls() {
        for(int j=0; j<8; j++) {
            Point tmpPointWest = new Point(0, j);
            Point tmpPointNorth = new Point(j, 0);
            Point tmpPointEast = new Point(7, j);
            Point tmpPointSouth = new Point(j, 7);
            Cell cellWest = new Cell(1, ObjectiveColor.None);
            Cell cellNorth = new Cell(2, ObjectiveColor.None);
            Cell cellEast = new Cell(3, ObjectiveColor.None);
            Cell cellSouth = new Cell(4, ObjectiveColor.None);
            board.put(tmpPointWest, cellWest);
            board.put(tmpPointNorth, cellNorth);
            board.put(tmpPointEast, cellEast);
            board.put(tmpPointSouth, cellSouth);
        }
    }

    private void addCorners() {
        Point tmpPointNorthWest = new Point(0, 0);
        Point tmpPointNorthEast = new Point(7, 0);
        Point tmpPointSouthWest = new Point(0, 7);
        Point tmpPointSouthEast = new Point(7, 7);
        Cell cornerNorthWest = new Cell(5, ObjectiveColor.None);
        Cell cornerNorthEast = new Cell(8, ObjectiveColor.None);
        Cell cornerSouthEast = new Cell(6, ObjectiveColor.None);
        Cell cornerSouthWest = new Cell(7, ObjectiveColor.None);
        board.put(tmpPointNorthWest, cornerNorthWest);
        board.put(tmpPointNorthEast, cornerNorthEast);
        board.put(tmpPointSouthWest, cornerSouthWest);
        board.put(tmpPointSouthEast, cornerSouthEast);
    }

    private void addBots() {
        for(int i=0; i<4; i++) {
            int randX = (int) (Math.random() * (7 - 0 + 1));
            int randY = (int) (Math.random() * (7 - 0 + 1));
            Cell tmpCell = getCell(randX, randY);
            if (tmpCell.isCorner() || tmpCell.getObjectiveColor() != ObjectiveColor.None) {
                i--;
                continue;
            }
            Point tmpPoint = new Point(randX, randY);
            Bot bot = new Bot(BotColor.values()[i], tmpPoint);
            board.put(tmpPoint, tmpCell);
            botList.add(bot);
        }
    }

    public void getBotPositions() {
        System.out.println(
                "Red robot: " + botList.get(0).getPosition()
                        + "Blue robot: " + botList.get(1).getPosition()
                        + "Green robot: " + botList.get(2).getPosition()
                        + "Yellow robot: " + botList.get(3).getPosition()
        );
    }
}