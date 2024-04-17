package agents120;

import spaces.Spaces;
import sweep.SimStateSweep;

public class environmentt extends SimStateSweep {

	public int n = 500; // Initial number of agents
	public double p = 0.0; // probility of randomly changing direction
	public double pActive = 1.0; // probaility of activity
	public boolean oneAgentPerCell = false; // one agent per cell = true
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public double getpActive() {
		return pActive;
	}

	public void setpActive(double pActive) {
		this.pActive = pActive;
	}

	public boolean isOneAgentPerCell() {
		return oneAgentPerCell;
	}

	public void setOneAgentPerCell(boolean oneAgentPerCell) {
		this.oneAgentPerCell = oneAgentPerCell;
	}

	public environmentt(long seed, Class observer) {
		super(seed, observer);
	}
	
	public void makeAgents() {
		if((n> (gridWidth *gridHeight)) && this.oneAgentPerCell) {
			System.out.println("Too much agents for this space");
			return;
		}
		for(int i =0; i<n; i++) {
			int x = random.nextInt(gridWidth);
			int y = random.nextInt(gridHeight);
			int xdir = random.nextInt(3) - 1;
			int ydir = random.nextInt(3) - 1;
			
			while(sparseSpace.getObjectsAtLocation(x, y) != null) {
				x = random.nextInt(gridWidth);
				y = random.nextInt(gridHeight);
			}
			
			Agent a = new Agent(x, y, xdir, ydir);
			this.sparseSpace.setObjectLocation(a, x, y);
			this.schedule.scheduleRepeating(a);
		}
	}
	
	public void start() {
		super.start();
		spaces = Spaces.SPARSE;
		this.make2DSpace(spaces, this.gridWidth, this.gridHeight);
		makeAgents();
	}

}
