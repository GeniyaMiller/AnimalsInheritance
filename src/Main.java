import Animals.Amphibious.Amphibious;
import Animals.Birds.Flightless.Flightless;
import Animals.Birds.Flying.Flying;
import Animals.Mammals.Herbivorous.Herbivorous;
import Animals.Mammals.Predators.Predators;

public class Main {
    public static void main(String[] args) {
        Amphibious frog = new Amphibious("frog", "Pup", 3, "pond");
        System.out.println(frog);
        frog.eat(frog.getAnimals());
        frog.go();
        frog.sleep();
        frog.hunt();

        Amphibious snackFreshWater = new Amphibious("snack", "Yel", 5, "pond");
        System.out.println(snackFreshWater);
        snackFreshWater.eat(snackFreshWater.getAnimals());
        snackFreshWater.go();
        snackFreshWater.sleep();
        snackFreshWater.hunt();
        System.out.println(frog.equals(snackFreshWater));



        Flightless penguin = new Flightless("Penguin", "Po", 3, "Antarctica", "walk and swim");
        System.out.println(penguin);
        penguin.eat(penguin.getAnimals());
        penguin.go();
        penguin.sleep();
        penguin.hunt();
        penguin.walk();

        Flightless peacock = new Flightless("Peacock", "Ro", 6, "forest", "walk");
        System.out.println(peacock);
        peacock.eat(peacock.getAnimals());
        peacock.go();
        peacock.sleep();
        peacock.hunt();
        peacock.walk();

        Flightless dodo = new Flightless("Dodo", "do", 8, "forest", "walk");
        System.out.println(dodo);
        dodo.eat(dodo.getAnimals());
        dodo.go();
        dodo.sleep();
        dodo.hunt();
        dodo.walk();

        Flying chaika = new Flying("chaika", "bel", 6, "coast", "Fly");
        System.out.println(chaika);
        chaika.eat(chaika.getAnimals());
        chaika.go();
        chaika.sleep();
        chaika.hunt();
        chaika.fly();

        Flying albatros = new Flying("albatros", "alb", 2, "coast", "fly");
        System.out.println(albatros);
        albatros.eat(albatros.getAnimals());
        albatros.go();
        albatros.sleep();
        albatros.hunt();
        albatros.fly();

        Flying sokol = new Flying("sokol", "sok", 8, "forest", "fly");
        System.out.println(sokol);
        sokol.eat(sokol.getAnimals());
        sokol.go();
        sokol.sleep();
        sokol.hunt();
        sokol.fly();



        Herbivorous gazelle = new Herbivorous("Gazelle", "Gaz", 10, "savanna", 50, "plants");
        System.out.println(gazelle);
        gazelle.eat(gazelle.getAnimals());
        gazelle.go();
        gazelle.sleep();
        gazelle.walk();
        gazelle.graze();

        Herbivorous giraffe = new Herbivorous("Giraffe", "G", 16, "savanna", 20,"plants");
        System.out.println(giraffe);
        giraffe.eat(giraffe.getAnimals());
        giraffe.go();
        giraffe.sleep();
        giraffe.walk();
        giraffe.graze();

        Herbivorous horse = new Herbivorous("Horse", "Ho", 14, "steppe", 50, "plants");
        System.out.println(horse);
        horse.eat(horse.getAnimals());
        horse.go();
        horse.sleep();
        horse.walk();
        horse.graze();

        Predators bear = new Predators("Bear", "Balu", 19, "forest", 23, "meat");
        System.out.println(bear);
        bear.eat(bear.getAnimals());
        bear.go();
        bear.sleep();
        bear.walk();
        bear.hunt();

        Predators tiger = new Predators("Tiger", "Ti", 16, "savanna", 31, "meat");
        System.out.println(tiger);
        tiger.eat(tiger.getAnimals());
        tiger.go();
        tiger.sleep();
        tiger.walk();
        tiger.hunt();

        Predators hyena = new Predators("Hyena", "Fox", 11, "savanna", 29, "meat");
        System.out.println(hyena);
        hyena.eat(hyena.getAnimals());
        hyena.go();
        hyena.sleep();
        hyena.walk();
        hyena.hunt();



    }
}