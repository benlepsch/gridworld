public class DancingBug extends BoxBug {
    private int[] turns;
    private int onTurn = 0;
    private int sideLength;
    private int steps = 0;

    DancingBug(int[] bruh, int sl) {
        super(sl);
        turns = bruh;
        sideLength = sl;
    }

    public void act() {
        if (steps < sideLength && canMove()) {
            move();
            steps ++;
        } else {
            for (int i = 0; i < turns[onTurn]; i++) {
                turn();
            }
            onTurn ++;
            if (onTurn == turns.length) {
                onTurn = 0;
            }
            steps = 0;
        }
    }
}