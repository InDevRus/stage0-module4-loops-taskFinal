package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (var row = 0; row < cathetusLength; row++) {
            var starsCount = row + 1;
            var line = " ".repeat(cathetusLength - starsCount) + "*".repeat(starsCount);
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
