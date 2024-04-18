package agents120;

import sim.engine.SimState;
import sim.engine.Steppable;
import sim.util.Bag;

public class Agent implements Steppable {
	int x; //x location of an agent
	int y; //y location of an agent
	int xdir;// x direction of movement
	int ydir;// y direction of movement
	
	
	
	public Agent(int x, int y, int xdir, int ydir) {
		super();
		this.x = x;
		this.y = y;
		this.xdir = xdir;
		this.ydir = ydir;
	}
	
	public void placeAgent(Environment state) {
		if(state.oneAgentPerCell) {
			int tempx = x+xdir;
			int tempy = y+ydir;
			tempx = state.sparseSpace.stx(tempx);
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
			x = state.sparseSpace.stx(x);
			y = state.sparseSpace.sty(y);
			state.sparseSpace.setObjectLocation(this, x, y);
		}
	}

	public void move(Environment state) {
		if(state.random.nextBoolean(state.pActive)) {
			if(state.random.nextBoolean(state.p)) {
				xdir = state.random.nextInt(3)-1;
				ydir = state.random.nextInt(3)-1;
			}
			placeAgent(state);
		}
	}
	
	public int decideX(Environment state, Bag neighbors) {
		int posX = 0, negX = 0;
		for(int i=0; i<neighbors.numObjs; i++) {
			Agent a = (Agent)neighbors.objs[i];
			if (a.x > this.x) {
				posX++;
			}
			else if (a.x < this.x){
				negX++;
			}
		}
		if(posX > negX) {
			return 1;
		}
		if (negX > posX) {
			return -1;
		}
		return 0;
	}
	
	public int decideY(Environment state, Bag neighbors) {
		int posY = 0, negY= 0;
		for(int i=0; i<neighbors.numObjs; i++) {
			Agent a = (Agent)neighbors.objs[i];
			if (a.y > this.y) {
				posY++;
			}
			else if (a.y < this.y){
				negY++;
			}
		}
		if(posY > negY) {
			return 1;
		}
		if (negY > posY) {
			return -1;
		}
		return 0;
	}
	
	public void aggregate(Environment state) {
		Bag neighbors = state.sparseSpace.getMooreNeighbors(x, y, state.searchRadius, state.sparseSpace.TOROIDAL, false);
		this.xdir = decideX(state, neighbors);
		this.ydir = decideY(state, neighbors);
		this.placeAgent(state);
	}


	public void step(SimState state) {
		Environment eState = (Environment)state;
		if(state.random.nextBoolean(eState.aggregate)) {
			aggregate(eState);
		}
		else {
			move((Environment)state);
		}

	}

}
