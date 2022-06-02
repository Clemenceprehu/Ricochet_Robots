package com.example.ricochet_robots;

import com.example.ricochet_robots.board.Board;
import com.example.ricochet_robots.board.Cell;
import com.example.ricochet_robots.board.ObjectiveColor;

import java.util.Optional;

public class Game {
    private Board gameBoard;

    public void initGame() {
        initBlankBoard();
    }

    private void initBlankBoard() {
        HashMap<Point, Cell> newBoard = new HashMap();
        for (int i=0; i < 8; i++) {
            for (int j=0; j < 8; j++) {
                Point tmpPoint = new Point(j, i);
                Cell tmpCell = new Cell(0, ObjectiveColor.None);
                newBoard.put(tmpPoint, tmpCell);
            }
        }
        gameBoard = new Board(newBoard);
    }

    private void setupCell(Integer x, Integer y, Integer tmpWall, Boolean tmpCorner, ObjectiveColor tmpObjectiveColor) {
        Optional<Integer> wall = Optional.ofNullable(tmpWall);
        Optional<Boolean> corner = Optional.ofNullable(tmpCorner);
        Optional<ObjectiveColor> objectiveColor = Optional.ofNullable(tmpObjectiveColor);
        Cell tmpCell = gameBoard.getCell(x, y);
        if(wall.isPresent()) {
            tmpCell.setWalls(wall.get());
        } else if (corner.isPresent()) {
            tmpCell.setCorner(corner.get());
        } else {
            tmpCell.setObjectiveColor(objectiveColor.get());
        }
        gameBoard.setCell(new Point(x, y), tmpCell);
    }
}
