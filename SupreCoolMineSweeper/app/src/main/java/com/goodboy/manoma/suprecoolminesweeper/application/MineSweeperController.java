package com.goodboy.manoma.suprecoolminesweeper.application;

import com.goodboy.manoma.suprecoolminesweeper.domain.CellList;
import com.goodboy.manoma.suprecoolminesweeper.domain.CellPosition;
import com.goodboy.manoma.suprecoolminesweeper.presentation.EventInfo;
import com.goodboy.manoma.suprecoolminesweeper.domain.Field;

/**
 * マインスイーパーのコントローラー
 */
public class MineSweeperController {
    Field field;
    CellList cells;
    public MineSweeperController(Field field) {
        this.field = field;
        this.cells = new CellList(field);
    }

    public void transit(CellPosition position, EventInfo eventInfo) {
        this.cells.transit(this.field, position, eventInfo);
    }
}
