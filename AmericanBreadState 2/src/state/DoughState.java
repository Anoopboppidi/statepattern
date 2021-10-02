package state;

public class DoughState implements State {
	AmericanBread americanBread;
	public DoughState(AmericanBread bread ) {
		this.americanBread = bread;
	}

	@Override
	public void makeDough() {
		System.out.println("Preparing dough");
		americanBread.setState(americanBread.getRisenState());
	}

	@Override
	public void makeRisen() {
		System.out.println("Dough not ready");
		
		
	}

	@Override
	public void bake() {
		System.out.println("Dough not risen yet");

	}

	@Override
	public void breadReady() {
		System.out.println("Dough not baked yet");

	}
	public String toString() {
		return " dough preparation";
	}
}
