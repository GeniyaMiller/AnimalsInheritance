package animal.bird.flightless;

import animal.bird.Bird;

public class Flightless extends Bird {

    public Flightless(String animals, String name, int age, String livingEnvironment, String typeOfMovement) {
        super(animals, name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    public void hunt() {
        System.out.println("I hunt");
    }

    public void walk (){
        System.out.println("I walk");
    }

    @Override
    public void eat(String animals) {
        if (animals.equals("penguin")){
            System.out.println("I eat fish");
        }
        if (animals.equals("peacock")){
            System.out.println("I eat grain and small reptiles");
        }
        if (animals.equals("dodo")){
            System.out.println("I eat grain and insects");
        }

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
    public String toString() {
        return "Animals{" +
                getAnimals() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                "typeOfMovement=" + getTypeOfMovement() +
                '}' + getClass();
    }

}
