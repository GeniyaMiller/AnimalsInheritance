package Animals.Birds;

import Animals.Animals;

public abstract class Birds extends Animals {
    private String typeOfMovement;

    public Birds(String animals, String name, int age, String livingEnvironment, String typeOfMovement) {
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

}
