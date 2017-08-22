package com.goodboy.manoma.suprecoolminesweeper.domain.state;

import com.goodboy.manoma.suprecoolminesweeper.domain.Bomb;
import com.goodboy.manoma.suprecoolminesweeper.presentation.EventInfo;

/**
 * マスの状態一覧
 */
public enum  CellType {
    INITIAL(new Initial()),
    FLAG(new Flag()),
    NUMBER(new Number()),
    BOMB(new Explosion());

    private CellState state;

    private CellType(CellState state) {
        this.state = state;
    }

    public boolean canTransit(EventInfo event) {
        return this.state.canSweep(event);
    }

    public void sweep(EventInfo event, Bomb bomb) {
        this.state.sweep(event, bomb);
    }

    public void display() {
        this.state.display();
    }
}
