package com.example;

public class DivisibleByReplacer implements IPlayedNumberChecker {
    private int _divisor;
    private String _replacement;

    public DivisibleByReplacer(int divisor, String replacement) {
        _divisor = divisor;
        _replacement = replacement;
    }

    public String checkPlay(int playedNumber) {
        if (playedNumber % _divisor == 0) {
            return _replacement;
        }

        return "";
    }
}
