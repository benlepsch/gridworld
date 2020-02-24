import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;

public class ChameleonKid extends ChameleonCritter {
    public void processActors(ArrayList<Actor> actors) {
        int n = actors.size();
        if (n == 0) {
            Color c = getColor();
            int red = (int) (c.getRed() * 0.95);
            int green = (int) (c.getGreen() * 0.95);
            int blue = (int) (c.getBlue() * 0.95);
            setColor(new Color(red, green, blue));
            return;
        }

        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getLocation().getCol() == getLocation().getCol()) {
                setColor(actors.get(i).getColor());
            }
        }
    }
}