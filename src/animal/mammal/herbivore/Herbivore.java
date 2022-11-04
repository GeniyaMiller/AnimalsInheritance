package animal.mammal.herbivore;

import animal.mammal.Mammal;

public class Herbivore extends Mammal {

    public Herbivore(String animals, String name, int age, String livingEnvironment, int speed, String typeEat) {
        super(animals, name, age, livingEnvironment, speed, typeEat);
    }

    public void graze(){
        System.out.println("I am grazing");
    }

    @Override
    public void eat(String animals) {
        System.out.println("I eat grass and leaves");
    }

    @Override
    public void go() {
        System.out.println("I walk on land");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep on land");
    }

    @Override
    public void walk() {
        System.out.println("I walk on land");
    }

    @Override
    public String toString() {
        return "Animals{" +
                getAnimals() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", speed=" + getSpeed() +
                ", typeEat=" + getTypeEat() +
                '}' + getClass();
    }

}


