package com.goodboy.manoma.suprecoolminesweeper.domain.state;

import com.goodboy.manoma.suprecoolminesweeper.domain.Bomb;
import com.goodboy.manoma.suprecoolminesweeper.presentation.EventInfo;

/**
 * マスの状態
 */
public interface CellState {
    public boolean canSweep(EventInfo event);
    public void sweep(EventInfo event, Bomb bomb);
    public CellType display();
}
