import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter {
    public int n;

    public BlusterCritter(int c) {
        super();
        n = c;
    }

    public int constrain(int v, int min, int max) {
        if (v > max) {
            return max;
        }
        if (v < min) {
            return min;
        }
        return v;
    }

    public void processActors(ArrayList<Actor> actors) {
        int len = actors.size();

        if (len > n) {
            // get darker
            Color col = getColor();
            int r = constrain((int) (col.getRed() * 0.9), 0, 255);
            int g = constrain((int) (col.getGreen() * 0.9), 0, 255);
            int b = constrain((int) (col.getBlue() * 0.9), 0, 255);
            r += 1;
            g += 1;
            b += 2;
            setColor(new Color(r, g, b));
        }

        if (len < n) {
            // get lighter
            Color col = getColor();
            int r = constrain((int) (col.getRed() * 1.1), 0, 255);
            int g = constrain((int) (col.getGreen() * 1.1), 0, 255);
            int b = constrain((int) (col.getBlue() * 1.1), 0, 255);
            setColor(new Color(r, g, b));
        }
    }

    public ArrayList<Actor> getActors() {
        // i can do the four corners yes
        /*
            x x x x x
            x H x H x
            x x o x x
            x H x H x
            x x x x x
        */
        // getNeighbors from each H minus four because it counts me four times

        Location m = getLocation();
        ArrayList<Actor> neighbors = new ArrayList<Actor>();
        neighbors.addAll(getGrid().getNeighbors(new Location(m.getRow() - 1, m.getCol() - 1)));
        neighbors.addAll(getGrid().getNeighbors(new Location(m.getRow() - 1, m.getCol() + 1)));
        neighbors.addAll(getGrid().getNeighbors(new Location(m.getRow() + 1, m.getCol() - 1)));
        neighbors.addAll(getGrid().getNeighbors(new Location(m.getRow() + 1, m.getCol() + 1)));
        neighbors = removeMe(neighbors);

        return neighbors;
    }

    public ArrayList<Actor> removeMe(ArrayList<Actor> l) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getLocation() == getLocation()) {
                l.remove(i);
                i--;
            }
        }
        return l;
    }
}