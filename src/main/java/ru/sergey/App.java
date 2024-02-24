package ru.sergey;

public class App 
{
    private static final int NUM_GAMES = 1000;

    public static void main(String[] args) {
        Playground game = new Playground();
        GameResult results = new GameResult();

        for (int i = 0; i < NUM_GAMES; i++) {
            game.play();
            results.addResult(game.isWin());
        }


        System.out.println("Статистика:");
        System.out.println("Побед: " + results.getWins());
        System.out.println("Поражений: " + results.getLosses());
    }
}
