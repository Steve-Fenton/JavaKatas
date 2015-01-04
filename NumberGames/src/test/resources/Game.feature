Feature: Number Games
  So that plays can be validated
  As a number game umpire
  I want to enter a play and see the correct answer

  Scenario Outline: A game of FizzBuzz
    Given I am officiating a "FizzBuzz" game
    When the number <played> is played
    Then I should be told the correct answer is "<result>"

  Examples:
    | played | result   |
    | 1      | 1        |
    | 2      | 2        |
    | 3      | Fizz     |
    | 5      | Buzz     |
    | 6      | Fizz     |
    | 10     | Buzz     |
    | 15     | FizzBuzz |

  Scenario Outline: A game of Crash Bang Wallop
    Given I am officiating a "CrashBangWallop" game
    When the number <played> is played
    Then I should be told the correct answer is "<result>"

  Examples:
    | played | result          |
    | 1      | 1               |
    | 2      | 2               |
    | 3      | Crash           |
    | 5      | Bang            |
    | 7      | Wallop          |
    | 15     | CrashBang       |
    | 35     | BangWallop      |
    | 21     | CrashWallop     |
    | 105    | CrashBangWallop |