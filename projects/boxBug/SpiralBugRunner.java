import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class SpiralBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        SpiralBug john = new SpiralBug(2);
        world.add(new Location(5, 5), john);
        world.show();
    }
}