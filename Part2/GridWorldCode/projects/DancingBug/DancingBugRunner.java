
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
	int[] directions = {2,7,9,1,5,6,3,9,4,2,1,4,3,2};
        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(directions);
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}
