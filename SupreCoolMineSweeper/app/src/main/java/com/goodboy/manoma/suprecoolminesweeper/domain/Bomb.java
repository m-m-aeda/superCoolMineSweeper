package com.goodboy.manoma.suprecoolminesweeper.domain;

import java.util.Random;

/**
 * 爆弾
 */
public class Bomb {
    private boolean isBomb;

    public Bomb() {
        this.isBomb = launchRandom();
    }

    public boolean isBomb() {
        return isBomb;
    }

    // 10分の1の確率で爆弾を設定します。
    private boolean launchRandom() {
        Random random = new Random();
        if(random.nextInt(10) == 0) {
            return true;
        }
        return false;
    }
}
