package lecture5.example;

abstract class Unit {
	protected String name;
	protected int energy;
	abstract public void decEnergy();
	public int getEnergy(){
		return energy;
	}

}
