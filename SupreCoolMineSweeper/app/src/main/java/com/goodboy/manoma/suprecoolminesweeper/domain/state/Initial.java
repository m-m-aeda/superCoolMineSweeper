package com.goodboy.manoma.suprecoolminesweeper.domain.state;

import com.goodboy.manoma.suprecoolminesweeper.domain.Bomb;
import com.goodboy.manoma.suprecoolminesweeper.presentation.EventInfo;

/**
 * 初期状態
 */
class Initial implements CellState {
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
