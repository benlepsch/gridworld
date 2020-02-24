import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        DancingBug john = new DancingBug(new int[] {3, 5, 1, 6, 2}, 4);
        world.add(new Location(3, 3), john);
        world.show();
    }
}