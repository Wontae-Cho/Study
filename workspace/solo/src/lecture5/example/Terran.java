package lecture5.example;

public class Terran extends Unit {
	boolean fly;

	public Terran(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	public void decEnergy(){
		energy -=3;
	}

}
