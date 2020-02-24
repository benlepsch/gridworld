import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class BlusterCritterRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Location(3, 4), new QuickCrab());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(3, 5), new Rock());
        world.show();
    }
}