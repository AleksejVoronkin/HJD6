package org.example;

import org.example.Tools.*;

public class App
{
    public static void main(String[] args) {
        System.out.println("Start");
        MontyHallSimulation simulation = new MontyHallSimulation();
        simulation.simulate(1000);
        simulation.printResults();
        System.out.println("Done");
    }
}
