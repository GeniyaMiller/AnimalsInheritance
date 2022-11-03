package Animals.Mammals;

import Animals.Animals;

public abstract class Mammals extends Animals {
    private int speed;
    private  String typeEat;

    public Mammals(String animals, String name, int age, String livingEnvironment, int speed, String typeEat) {
        super(animals, name, age, livingEnvironment);
        if (speed < 0){
            this.speed = Math.abs(speed);
        }
        this.speed = speed;
        this.typeEat = typeEat;
    }
    public abstract void walk ();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getTypeEat() {
        return typeEat;
    }

    public void setTypeEat(String typeEat) {
        this.typeEat = typeEat;
    }
}
