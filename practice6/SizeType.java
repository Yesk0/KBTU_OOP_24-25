package practice6;

public enum SizeType {
    ExtraLarge("XLarge"),
    Large("Large"),
    Medium("Medium"),
    Small("Small"),
    ExtraSmall("XSmall");
    private final String name;


    SizeType(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return name;
    }
}
