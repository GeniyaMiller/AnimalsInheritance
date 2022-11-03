package Animals.Amphibious;

import Animals.Animals;

public class Amphibious extends Animals {
    public Amphibious(String animals, String name, int age, String livingEnvironment) {
        super(animals, name, age, livingEnvironment);
    }

    public void hunt(){
        System.out.println("I hunt mobile prey");
    }

    @Override
    public void eat(String animals) {
        if (animals == "frog"){
            System.out.println("I eat mosquitoes");
        }
        if (animals == "snack"){
            System.out.println("I eat frogs and rodents");
        }

    }

    @Override
    public void go() {
        System.out.println("I move on water and on land");

    }

    @Override
    public void sleep() {
        System.out.println("I sleep in borrow");

    }

    @Override
    public String toString() {
        return "Animals{" +
                getAnimals() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                '}' + getClass();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
