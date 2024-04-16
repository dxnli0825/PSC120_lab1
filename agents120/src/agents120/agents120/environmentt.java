package agents120;

import spaces.Spaces;
import sweep.SimStateSweep;

public class environmentt extends SimStateSweep {

	public int n = 500;
	
	public environmentt(long seed, Class observer) {
		super(seed, observer);
	}
	
	public void makeAgents() {
		
	}
	
	public void start() {
		super.start();
		spaces = Spaces.SPARSE;
		this.make2DSpace(spaces, this.gridWidth, this.gridHeight);
		makeAgents();
	}

}
