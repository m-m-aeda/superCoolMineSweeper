package com.goodboy.manoma.suprecoolminesweeper.domain;

import com.goodboy.manoma.suprecoolminesweeper.domain.state.CellType;
import com.goodboy.manoma.suprecoolminesweeper.presentation.EventInfo;

/**
 * マス。
 */
class Cell {
    private Bomb bomb;
    private CellType type;

    public Cell() {
        this.bomb = new Bomb();
        this.type = CellType.INITIAL;
    }

    void transit(EventInfo event) {
        if (this.type.canTransit(event)) {
            this.type.sweep(event, this.bomb);
            return;
        }
    }
}


