package zoo;

public class Bat extends Mammal {
    public Bat() {
        this.energy = 300; // Default energy level for a Bat is 300
    }

    public void fly() {
        this.energy -= 50;
        System.out.println("Bat is airborne.");
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("Bat is satisfied after eating humans.");
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("Bat is attacking a town.");
    }
}
