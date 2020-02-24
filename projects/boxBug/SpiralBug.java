public class SpiralBug extends BoxBug {
    private int steps = 0;
    private int sideLength;

    public SpiralBug(int length) {
        super(length);
        sideLength = length;
    }

    public void act() {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            turn();
            turn();
            steps = 0;
            sideLength += 2;
        }
    }
}