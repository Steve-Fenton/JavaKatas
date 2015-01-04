package com.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class GameSteps {
    private Game _target;
    private String _actualResult;

    @Given("^I am officiating a \"([^\"]*)\" game$")
    public void I_am_officiating_a_game(String gameTypeName) {
        GameType gameType = GameType.valueOf(gameTypeName);
        _target = GameFactory.createGame(gameType);
    }

    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int playedNumber) {
        _actualResult = _target.checkPlay(playedNumber);
    }

    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void I_should_be_told_the_correct_answer_is(String expectedResult) {
        assertEquals(expectedResult, _actualResult);
    }
}
