package com.goodboy.manoma.suprecoolminesweeper.domain;

/**
 * 対象のマスの場所を表します。
 */
public class CellPosition {
    private int columnPosition;
    private int rowPosition;

    public CellPosition(int columnPosition, int rowPosition) {
        this.columnPosition = columnPosition;
        this.rowPosition = rowPosition;
    }

    /**
     * 一番最初のマスからの数を返す。
     */
    public int getCellNumber(Field field) {
        return 0;
    }
}
