public class CircleBug extends BoxBug {
    private int steps = 0;
    private int sideLength;

    public CircleBug(int r) {
        super(r);
        sideLength = r;
    }

    public void act() {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}