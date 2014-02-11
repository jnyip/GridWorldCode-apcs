
import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int[] Directions;
    private int i=0;
    public int turn(int i){
	int b = i;
	while(b > 0){
	    setDirection(getDirection() + 45);
	    b-=1;
	}
    }
    public DancingBug(int[] nums)
    {
	Directions = nums;
    }
    public void act()
    {
        if(i<Directions.length){
	    Rotate(Directions[i]);
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
