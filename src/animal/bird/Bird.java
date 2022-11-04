package animal.bird;

import animal.Animal;

import java.util.Objects;

public abstract class Bird extends Animal {
    private String typeOfMovement;

    public Bird(String animals, String name, int age, String livingEnvironment, String typeOfMovement) {
        super(animals, name, age, livingEnvironment);
        if (checkNullOrEmptyOrBlank(typeOfMovement)){
            this.typeOfMovement = "Fly";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public abstract void hunt();

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(typeOfMovement, bird.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
