package com.goodboy.manoma.suprecoolminesweeper.domain;

import com.goodboy.manoma.suprecoolminesweeper.presentation.EventInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * マス一覧。
 */
public class CellList {
    List<Cell> cells;

    public CellList(Field field) {
        this.cells = new ArrayList<>();
        for (int i = 0; i < field.sumNumberOfCell(); i++) {
            this.cells.add(new Cell());
        }
    }

    public void transit(Field field, CellPosition position, EventInfo eventInfo) {
        getCell(field, position).transit(eventInfo);
    }

    private Cell getCell(Field field, CellPosition position) {
        int index = position.getCellNumber(field);
        return this.cells.get(index);
    }
}
