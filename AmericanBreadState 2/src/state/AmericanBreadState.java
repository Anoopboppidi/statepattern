package state;

public class AmericanBreadState {

	public static void main(String[] args) {
		
		AmericanBread americanBread = new AmericanBread();
		
		System.out.println(americanBread);
		//Dough State
		System.out.println("--------Dough State---------\n");
		americanBread.makeRisen();
		americanBread.bakeBread();
		americanBread.finish();
		americanBread.makeDough();
		System.out.println(americanBread);
		//risen state
		System.out.println("--------Risen State---------\n");
		americanBread.makeRisen();
		americanBread.makeDough();
		americanBread.finish();
		americanBread.bakeBread();
		System.out.println(americanBread);
		//bake state
		
		System.out.println("--------Baking State---------\n");
		americanBread.makeDough();
		americanBread.makeRisen();
		americanBread.finish();
		americanBread.bakeBread();
		System.out.println(americanBread);
		//ready state
		System.out.println("--------Ready State---------\n");
		americanBread.makeDough();
		americanBread.makeRisen();
		americanBread.bakeBread();
		americanBread.finish();
		System.out.println(americanBread);
	}

}
