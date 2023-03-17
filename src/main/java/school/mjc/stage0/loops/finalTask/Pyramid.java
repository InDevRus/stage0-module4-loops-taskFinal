package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (var y = 0; y < cathetusLength; y ++ ) {
            for (var x = -cathetusLength + 1; x <= y; x ++) {
                var distanceToMiddle = Math.abs(x);
                System.out.print(distanceToMiddle <= y ? distanceToMiddle + 1 : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
