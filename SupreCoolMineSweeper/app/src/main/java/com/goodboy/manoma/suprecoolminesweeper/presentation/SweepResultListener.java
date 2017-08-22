package com.goodboy.manoma.suprecoolminesweeper.presentation;

import com.goodboy.manoma.suprecoolminesweeper.domain.state.CellType;

/**
 * sweepした結果
 */
public interface SweepResultListener {
    public void notifyResult(CellType type);
}
