package agents120;

import java.awt.Color;

import spaces.Spaces;
import sweep.GUIStateSweep;
import sweep.SimStateSweep;

public class agentUI extends GUIStateSweep {

	public agentUI(SimStateSweep state, int gridWidth, int gridHeight, Color backdrop, Color agentDefaultColor,
			boolean agentPortrayal) {
		super(state, gridWidth, gridHeight, backdrop, agentDefaultColor, agentPortrayal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agentUI.initialize(environmentt.class, null, agentUI.class, 600, 600, Color.WHITE, Color.BLUE, true, Spaces.SPARSE);
	}

}
