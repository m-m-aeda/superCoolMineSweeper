package com.goodboy.manoma.suprecoolminesweeper.domain.state;

import com.goodboy.manoma.suprecoolminesweeper.domain.Bomb;
import com.goodboy.manoma.suprecoolminesweeper.presentation.EventInfo;

/**
 * 旗の状態
 */
class Flag implements CellState {
    @Override
    public boolean canSweep(EventInfo event) {
        return false;
    }

    @Override
    public void sweep(EventInfo event, Bomb bomb) {

    }

    @Override
    public CellType display() {
        return null;
    }
}
