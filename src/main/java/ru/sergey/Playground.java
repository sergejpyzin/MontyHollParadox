package ru.sergey;

import java.util.Random;

public class Playground {
        private final Random random = new Random();
        private int chosenDoor;
        private int doorWithPrice;

        public void play() {
            chosenDoor = random.nextInt(3) + 1;
            doorWithPrice = random.nextInt(3) + 1;
        }

        public boolean isWin() {
            return chosenDoor == doorWithPrice;
        }


}
