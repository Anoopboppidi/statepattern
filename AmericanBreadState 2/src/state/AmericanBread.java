package state;

public class AmericanBread {


		State doughState;
		State risenState;
		State bakeState;
		State readyState;
		
		State state;
	
	public AmericanBread() {
		doughState = new DoughState(this);
		risenState = new RisenState(this);
		bakeState = new BakeState(this);
		readyState = new BreadReadyState(this);
		state = doughState;
	}
	
	public void makeDough() {
		state.makeDough();
	}
	public void makeRisen() {
		state.makeRisen();
	}
	public void bakeBread() {
		state.bake();
	}
	public void finish() {
		state.breadReady();
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getDoughState() {
		return doughState;
	}
	public State getRisenState() {
		return risenState;
	}
	public State getBreadReadyState() {
		return readyState;
	}
	public State getBakeState() {
		return bakeState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n WalMart Bakery \n");
		
		
		result.append("Bread is " + state + "\n");
		return result.toString();
	}

}
