package com.example;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GameFactory {
    public static Game createGame(GameType gameType) {
        ArrayList<IPlayedNumberChecker> checkers = new ArrayList<IPlayedNumberChecker>();

        switch (gameType) {
            case FizzBuzz:
                checkers.add(new DivisibleByReplacer(3, "Fizz"));
                checkers.add(new DivisibleByReplacer(5, "Buzz"));
                return new Game(checkers);
            case CrashBangWallop:
                checkers.add(new DivisibleByReplacer(3, "Crash"));
                checkers.add(new DivisibleByReplacer(5, "Bang"));
                checkers.add(new DivisibleByReplacer(7, "Wallop"));
                return new Game(checkers);
            default:
                throw new NoSuchElementException();
        }
    }
}
