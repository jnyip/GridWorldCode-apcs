
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;
public class CirclebugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Circlebug alice = new Circlebug(6);
        alice.setColor(Color.ORANGE);
        Circlebug bob = new Circlebug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
