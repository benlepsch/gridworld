import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Bug {
    public void act() {
        Grid<Actor> bruh = getGrid();
        Location step1 = getLocation().getAdjacentLocation(getDirection());
        Location step2 = step1.getAdjacentLocation(getDirection());
        if (!bruh.isValid(step2) || ((bruh.get(step2) instanceof Rock) || bruh.get(step2) instanceof Bug)) {
            if (!bruh.isValid(step1) || ((bruh.get(step1) instanceof Rock) || bruh.get(step1) instanceof Bug)) {
                // at the edge of the border, turn 90 degrees
                // both steps are invalid somehow
                turn();
                turn();
                return;
            }
            // move one spot to the edge of the border (if not rock)
            // step 1 is valid but not step 2
            moveTo(step1);
            return;
        }
        // can jump two ahead freely, its not off the border/bug/rock
        moveTo(step2);
        return;   
    }
}