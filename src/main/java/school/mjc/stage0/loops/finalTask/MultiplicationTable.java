package school.mjc.stage0.loops.finalTask;

import java.text.MessageFormat;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        var PATTERN = "{0} x {1} = {2}";
        for (var multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(MessageFormat.format(PATTERN, multiplier, numberTableToPrint, multiplier * numberTableToPrint));
        }
    }
}
