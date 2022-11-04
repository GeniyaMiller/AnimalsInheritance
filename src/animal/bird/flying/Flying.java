package animal.bird.flying;

import animal.bird.Bird;

public class Flying extends Bird {
    public Flying(String animals, String name, int age, String livingEnvironment, String typeOfMovement) {
        super(animals, name, age, livingEnvironment, typeOfMovement);
    }


    public  void fly(){
        System.out.println("I am flying");
    }


    @Override
    public void eat(String animals) {
        if (animals.equals("chaika") || animals.equals("albatros")){
            System.out.println("I eat fish");
        }
        if (animals.equals("sokol")){
            System.out.println("I eat rodents ant small reptiles");
        }

    }
    @Override
    public void hunt() {
        System.out.println("I hunt");
    }

    @Override
    public void go() {
        System.out.println("I am moving through the air");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep in the nest");

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
