import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

public class JumperRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        Jumper AsherSaunders = new Jumper();
        Rock rock = new Rock();
        Rock rock2 = new Rock();
        world.add(new Location(4,6), AsherSaunders);
        world.add(new Location(3,6), rock);
        world.add(new Location(0,6), rock2);
        world.show();
    }
}