import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class KingCrab extends CrabCritter {
    public KingCrab() {
        super();
    }

    public void processActors(ArrayList<Actor> actors) {
        Location myLoc = getLocation();
        int myRow = myLoc.getRow();
        int myCol = myLoc.getCol();
        for (Actor a : actors) {
            Location theirs = a.getLocation();
            int theirRow = theirs.getRow();
            int theirCol = theirs.getCol();

            if (theirRow > myRow) {
                theirRow += 1;
            } else if (theirRow < myRow) {
                theirRow -= 1;
            }

            if (theirCol > myCol) {
                theirCol += 1;
            } else if (theirCol < myCol) {
                theirCol -= 1;
            }

            Location newLoc = new Location(theirRow, theirCol);
            Grid gr = getGrid();

            if (gr.get(newLoc) instanceof Rock || gr.get(newLoc) instanceof Actor) {
                a.removeSelfFromGrid();
            } else {
                a.moveTo(newLoc);
            }

        }
    }
}