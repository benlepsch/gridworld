import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
    public QuickCrab() {
        super();
    }

    public ArrayList<Location> getLocationsInDirections(int[] directions) {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        Location loc = getLocation();
        boolean ableToTwo = false;
        //System.out.println("My location: " + loc.toString());

        for (int d : directions) {

            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (!gr.isValid(loc))
                continue;
            Location twoAway = neighborLoc.getAdjacentLocation(getDirection() + d);
            if (!gr.isValid(twoAway))
                continue;
            if (!(gr.get(neighborLoc) instanceof Rock) && !(gr.get(twoAway) instanceof Rock)) {
                //System.out.print("adding location: ");
                //System.out.println(twoAway.toString());
                locs.add(twoAway);
                ableToTwo = true;
            }
        }

        if (!ableToTwo) {
            locs = super.getLocationsInDirections(directions);
        }

        return locs;
    }
}