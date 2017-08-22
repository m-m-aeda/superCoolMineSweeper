package com.goodboy.manoma.suprecoolminesweeper.domain;

/**
 * フィールド
 */
public class Field {
    private int column;
    private int row;

    public Field(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int sumNumberOfCell() {
        return this.column * this.row;
    }

    public int getRow() {
        return this.row;
    }
}
