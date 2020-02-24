import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.Critter;

public class KingCrabRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Location(3, 4), new KingCrab());
        world.add(new Location(2, 4), new Critter());
        world.show();
    }
}