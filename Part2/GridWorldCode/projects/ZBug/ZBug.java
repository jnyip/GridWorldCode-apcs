import info.gridworld.actor.Bug;
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int leg;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	leg = 0;
	setDirection(90);
	
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
	else if(steps == sideLength){
	    if (leg == 0){
		setDirection(225);
		steps = 0;
		leg += 1;
	    }
	    else if (leg==1) {
		steps = 0;
		setDirection(90);
		leg+= 1;
	    }
	    else{
		return;
	    }
	}
    }
}
	
