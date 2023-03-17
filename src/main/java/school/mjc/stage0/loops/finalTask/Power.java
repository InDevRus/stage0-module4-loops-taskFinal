package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        if (power < 0) {
            return;
        }

        var result = 1;
        for (var exponent = 1; exponent <= power; exponent++) {
            result *= numberToPrint;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
