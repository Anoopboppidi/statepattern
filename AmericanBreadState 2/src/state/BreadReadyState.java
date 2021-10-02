package state;

public class BreadReadyState implements State {
	AmericanBread americanBread;
	public BreadReadyState(AmericanBread bread) {
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
		System.out.println("Bread is already baked");

	}

	@Override
	public void breadReady() {
		System.out.println("Bread is ready");
		

	}
	public String toString() {
		return " ready";
	}

}
