package org.example.Tools;

import lombok.Getter;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import java.util.ArrayList;
import java.util.List;

@Getter
public class MontyHallSimulation {
    private final List<Boolean> resultsSwitch = new ArrayList<>();
    private final List<Boolean> resultsNotSwitch = new ArrayList<>();
    public void simulate(int iterations) {
        MontyHallGame game = new MontyHallGame();
        for (int i = 0; i < iterations; i++) {
            resultsSwitch.add(game.playGame(true));
            resultsNotSwitch.add(game.playGame(false));
        }
    }
    private double WinPerc(List<Boolean> results) {
        SummaryStatistics statistics = new SummaryStatistics();
        for (boolean win : results) {
            statistics.addValue(win ? 1 : 0);
        }
        return statistics.getMean() * 100.0;
    }
    public void printResults() {
        double winPercSwitch = WinPerc(resultsSwitch);
        double winPercNotSwitch = WinPerc(resultsNotSwitch);

        System.out.println("Шанс победы при смене выбора двери: " + winPercSwitch + "%");
        System.out.println("Шанс победы без смены выбора двери: " + winPercNotSwitch + "%");
    }
}