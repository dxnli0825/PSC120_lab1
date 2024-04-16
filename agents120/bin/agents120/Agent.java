package agents120;

import sim.engine.SimState;
import sim.engine.Steppable;

public class Agent implements Steppable {

	int x;
	int y;
	int xdir;
	int ydir;
	
	@Override
	public void step(SimState state) {
		// TODO Auto-generated method stub

	}
	public Agent(int x, int y, int xdir, int ydir) {
		super();
		this.x = x;
		this.y = y;
		this.xdir = xdir;
		this.ydir = ydir;
	}
	
	public void placeAgent(environmentt state) {
		if (state.oneAgentPerCell) {
			int tempx = x+xdir;
			int tempy = y+ydir;
			tempx = state.sparseSpace.stx(tempx); // change the value of x to 0 if x > xmax
			tempy = state.sparseSpace.sty(tempy);
			if(state.sparseSpace.getObjectsAtLocation(tempx, tempy) == null) {
				x = tempx;
				y = tempy;
				state.sparseSpace.setObjectLocation(this, x, y);
			}
		}
		else {
			x = x+xdir;
			y = y+ydir;
			x = state.sparseSpace.stx(x); // change the value of x to 0 if x > xmax
			y = state.sparseSpace.sty(y);
			state.sparseSpace.setObjectLocation(this, x, y);
		}
	}
	
	public void move(environmentt state) {
		if(state.random.nextBoolean(state.pActive)) {
			if (state.random.nextBoolean(state.p)) {
				xdir = state.random.nextInt(3)-1;
				ydir = state.random.nextInt(3)-1;
			}
			placeAgent(state);
		
		}
	}

}
