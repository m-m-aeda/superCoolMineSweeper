package com.goodboy.manoma.suprecoolminesweeper.presentation;

import android.view.View;

import com.goodboy.manoma.suprecoolminesweeper.application.MineSweeperController;
import com.goodboy.manoma.suprecoolminesweeper.domain.CellPosition;

/**
 * ユーザーからのクリックのイベントをハンドリングします。
 */
public class ClickEventHandler implements View.OnClickListener, View.OnLongClickListener{
    private MineSweeperController controller;
    private SweepResultListener listener;

    public ClickEventHandler(MineSweeperController controller, SweepResultListener listener) {
        this.controller = controller;
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        // TODO セルのポジションが適当
        CellPosition position = new CellPosition(0, 0);
        EventInfo event = new EventInfo(false, this.listener);
        this.controller.transit(position, event);
    }

    @Override
    public boolean onLongClick(View v) {
        // TODO セルのポジションが適当
        CellPosition position = new CellPosition(0, 0);
        EventInfo event = new EventInfo(true, this.listener);
        this.controller.transit(position, event);
        return false;
    }
}
