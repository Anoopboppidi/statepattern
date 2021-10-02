package state;

public class RisenState implements State {
	AmericanBread americanBread;
	public RisenState(AmericanBread bread) {
		this.americanBread = bread;
	}

	@Override
	public void makeDough() {
		System.out.println("Dough already prepared");

	}

	@Override
	public void makeRisen() {
		System.out.println("Dough rising");

	}

	@Override
	public void bake() {
		System.out.println("Baking bread");
		americanBread.setState(americanBread.getBakeState());

	}

	@Override
	public void breadReady() {
		System.out.println("Bread not ready yet");

	}
	
	public String toString() {
		return " risen";
	}

}
