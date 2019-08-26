package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int min;
    private int max;


    public BiggerNumberGame(int min, int max) {
        this.min = min;
        this.max = max;
        generateRandomNumbers();
    }

    public void generateRandomNumbers()
    {
        // generate a number between the upper & lower limits inclusive
        // store that in number1
        // generate a different number between the limits inclusive
        // store that in number2

        number1 = (int)(Math.random() * (max - min + 1)) + min;
        number2 = (int)(Math.random() * (max - min + 1)) + min;

        while(number1 == number2) {
            number1 = (int)(Math.random() * (max - min + 1)) ;
        }


    }

    public String checkAnswer(int answer)
    {
        // determine if the answer is right
        // update the score accordingly
        // return a relevant message
        int answ = Math.max(number1, number2);
        if(answer == answ) {
            score+= number2;
            return "Nice job! You solved a basic math problem.";

        }
        else {
            score -= number1;
            return "You have failed to solve a basic math problem.";
        }


    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
