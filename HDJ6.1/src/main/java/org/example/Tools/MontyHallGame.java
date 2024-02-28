package org.example.Tools;

import java.util.Random;

public class MontyHallGame {
    private final Random random = new Random();
    public boolean playGame(boolean switchDoor) {
        int winDoor = random.nextInt(3) + 1;
        int playerChoice = random.nextInt(3) + 1;
        int doorOpenMonty;
        do {
            doorOpenMonty = random.nextInt(3) + 1;
        } while (doorOpenMonty == playerChoice || doorOpenMonty == winDoor);
        if (switchDoor) {
            playerChoice = 6 - playerChoice - doorOpenMonty;
        }
        return playerChoice == winDoor;
    }
}