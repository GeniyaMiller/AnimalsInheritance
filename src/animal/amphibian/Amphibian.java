package animal.amphibian;

import animal.Animal;

public class Amphibian extends Animal {
    public Amphibian(String animals, String name, int age, String livingEnvironment) {
        super(animals, name, age, livingEnvironment);
    }

    public void hunt(){
        System.out.println("I hunt mobile prey");
    }

    @Override
    public void eat(String animals) {
        if (animals.equals("frog")){
            System.out.println("I eat mosquitoes");
        }
        if (animals.equals("snack")){
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

}
