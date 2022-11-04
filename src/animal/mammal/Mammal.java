package animal.mammal;

import animal.Animal;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private int speed;
    private  String typeEat;

    public Mammal(String animals, String name, int age, String livingEnvironment, int speed, String typeEat) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(typeEat, mammal.typeEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, typeEat);
    }
}
