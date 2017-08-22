package com.goodboy.manoma.suprecoolminesweeper.presentation;

import com.goodboy.manoma.suprecoolminesweeper.domain.state.CellType;

/**
 * Sweepの結果を受け取ります。
 */
public class SweepResultReceiver implements SweepResultListener {
    @Override
    public void notifyResult(CellType type) {
        type.display();
    }
}
