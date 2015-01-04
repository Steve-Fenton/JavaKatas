package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Game {
    public ArrayList<IPlayedNumberChecker> _checkers = new ArrayList<IPlayedNumberChecker>();

    public Game(ArrayList<IPlayedNumberChecker> checkers) {
        this._checkers = checkers;
    }

    public String checkPlay(int playedNumber) {
        String result = "";

        for(Iterator<IPlayedNumberChecker> i = this._checkers.iterator(); i.hasNext();) {
            result += i.next().checkPlay(playedNumber);
        }

        return (result.length() == 0) ? Integer.toString(playedNumber) : result;
    }
}

