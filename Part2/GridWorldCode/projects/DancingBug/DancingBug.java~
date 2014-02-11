
import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int[] Directions;
    private int i=0;
    public DancingBug(int[] nums)
    {
	Directions = nums;
    }
    public void act()
    {
        if(i<Directions.length){
	    setDirection(Directions[i]);
	    if (canMove()){
		move();
		i++;
	    }
	    else {
		i++;
	    }
	}
	else{
	}
    }
}
