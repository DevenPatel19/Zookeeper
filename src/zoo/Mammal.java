package zoo;

public class Mammal {
	protected int energy;
	
	public Mammal() {
		this.energy = 100;
	}
	
	public void displayEnergy() {
		System.out.println("Energy level: " + energy);
	}
}
