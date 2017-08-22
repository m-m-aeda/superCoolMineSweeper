package com.goodboy.manoma.suprecoolminesweeper.presentation;

import com.goodboy.manoma.suprecoolminesweeper.domain.state.CellType;

/**
 * プレゼンテーション層から来るイベントの情報
 */
public class EventInfo {
    private boolean isLongTap;
    private SweepResultListener listener;

    public EventInfo(boolean isLongTap, SweepResultListener listener) {
        this.isLongTap = isLongTap;
        this.listener = listener;
    }

    public boolean isLongTap() {
        return isLongTap;
    }

    public void notifyResult(CellType cellType) {
        this.listener.notifyResult(cellType);
    }
}
