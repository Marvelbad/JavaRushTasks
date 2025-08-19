package com.javarush.games.game2048;

import com.javarush.engine.cell.*;
import com.javarush.engine.cell.Game;

public class Game2048  extends Game {
    private static final int SIDE = 4;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
    }
}
