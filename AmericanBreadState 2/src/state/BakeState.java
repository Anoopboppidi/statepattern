package state;

public class BakeState implements State {
	AmericanBread americanBread;
	public BakeState ( AmericanBread bread) {
		this.americanBread = bread;
	}

	@Override
	public void makeDough() {
		System.out.println("Dough already made");

	}

	@Override
	public void makeRisen() {
		System.out.println("Dough already risen");

	}

	@Override
	public void bake() {
		System.out.println("Bread Baked");
		americanBread.setState(americanBread.getBreadReadyState());
		
	}

	@Override
	public void breadReady() {
		System.out.println("Bread Not ready");
		

	}
	public String toString() {
		return " baking";
	}

}
