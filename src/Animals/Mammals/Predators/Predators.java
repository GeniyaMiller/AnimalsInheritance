package Animals.Mammals.Predators;

import Animals.Mammals.Mammals;

public class Predators extends Mammals {


    public Predators(String animals, String name, int age, String livingEnvironment, int speed, String typeEat) {
        super(animals, name, age, livingEnvironment, speed, typeEat);
    }

    public void hunt() {
        System.out.println("I hunt");
    }
    @Override
    public void eat(String animals) {
        System.out.println("I eat meat");
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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
