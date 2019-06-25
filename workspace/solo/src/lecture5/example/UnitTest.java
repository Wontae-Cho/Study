package lecture5.example;

public class UnitTest {

	public static void main(String[] args) {
		Zerg z1 = new Zerg("Hydralisk",false);
		z1.decEnergy();
		System.out.println("z1ÀÇ Energy : "+z1.getEnergy());
		
		Protoss p1 = new Protoss("Corsair",true);
		p1.decEnergy();
		System.out.println("p1ÀÇ Energy : "+p1.getEnergy());
		
		Terran t1 = new Terran("Marine",false);
		t1.decEnergy();
		System.out.println("t1ÀÇ Energy : "+t1.getEnergy());


	}

}
