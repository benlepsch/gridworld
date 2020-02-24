import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CircleBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        CircleBug jeff = new CircleBug(2);
        jeff.setColor(Color.ORANGE);
        world.add(new Location(4,3), jeff);
        world.show();
    }
}