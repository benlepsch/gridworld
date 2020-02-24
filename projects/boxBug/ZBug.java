public class ZBug extends BoxBug {
    private int steps = 0;
    private int sideLength;
    private int onSide = 0;

    public ZBug(int r) {
        super(r);
        sideLength = r;
        turn();
        turn();
    }

    public void act() {
        if (onSide == 3)
            return;
        
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            onSide += 1;
            if (onSide == 3) {
                return;
            }
            turn();
            turn();
            turn();
            if (onSide == 2) {
                turn();
                turn();
            }
            steps = 0;
        }
    }
}