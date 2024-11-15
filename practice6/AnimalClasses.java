package practice6;

public enum AnimalClasses {
    Mammal("Mammal"),
    Fishe("Fish"),
    Bird("Bird"),
    Insect("Insect");
    private final String name;


    AnimalClasses(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return name;
    }
}
