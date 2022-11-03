package Animals;

public abstract class  Animals {
    private String animals;
    private String name;
    private int age;
    private String livingEnvironment; //параметр указан у всех объектов, поэтому вынесла в класс-родитель

    public Animals(String animals, String name, int age, String livingEnvironment) {
        this.animals = animals;

        if (checkNullOrEmptyOrBlank(name)) {
            this.name = "Animals";
        } else {
            this.name = name;
        }

        if (age < 0) {
            this.age = Math.abs(age);
            return;
        }
        this.age = age;

        if (checkNullOrEmptyOrBlank(livingEnvironment)) {
            this.livingEnvironment = "Default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public static boolean checkNullOrEmptyOrBlank(String value) {
        return value == null || value.isEmpty() || value.isBlank();
    }

    public abstract void eat(String animals);

    public abstract void go();

    public abstract void sleep();



    public String getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
