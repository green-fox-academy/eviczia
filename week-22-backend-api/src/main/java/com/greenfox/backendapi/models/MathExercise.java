package com.greenfox.backendapi.models;

public class MathExercise {

    private String what;
    private int[] numbers;

    public MathExercise(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public MathExercise() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public Result solve() {
        if (what.equals("sum")) return new Result(sumAll());
        if (what.equals("multiply")) return new Result(multiplyAll());
        return null;
    }

    public ResultArray solveDouble() {
        return new ResultArray(doubleEach());
    }

    private Integer sumAll() {
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        } return sum;
    }

    private Integer multiplyAll() {
        Integer product = 1;

        for (Integer number : numbers) {
            product *= number;
        }
        return product;
    }

    private Integer[] doubleEach() {
        Integer[] doubleNumbers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubleNumbers[i] = numbers[i] * 2;
        }
        return doubleNumbers;
    }

}

