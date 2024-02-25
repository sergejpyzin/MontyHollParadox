package ru.sergey;


import lombok.Data;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
@Data

public class GameResult {
    private final SummaryStatistics stats = new SummaryStatistics();

    public void addResult(boolean won) {
        if (won) {
            stats.addValue(1);
        } else {
            stats.addValue(0);
        }
    }

    public double getWins() {
        return stats.getSum();
    }

    public double getLosses() {
        return stats.getN() - stats.getSum();
    }
}


