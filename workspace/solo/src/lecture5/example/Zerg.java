package lecture5.example;

public class Zerg extends Unit{
	boolean fly;
	public Zerg(String n, boolean b){
		name = n;
		energy = 100;
		fly = b;
	}
	public void decEnergy(){
		energy -= 6;
	}

}
