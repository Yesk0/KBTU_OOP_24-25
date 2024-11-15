package practice6;

public enum Food {
    Beer("Beer",-10,100),
    Pizza("Pizza",15,200),
    Burger("Burger",5,100),
    Doner("Doner",1000,1000),
    Airan("Airan",40,100),
    Milk("Milk",79,1000),
    Coffee("Coffee",123,790),
    Tea("Tea",777,400),
    Sweets("Sweets",99,123),
    Vodka("Vodka",-1000,12),
    Bread("Bread",20,145);



    private final String name;
    private final int energy;
    private final int cost;

    Food(String s,int i,int j) {
        this.name = s;
        this.energy = i;
        this.cost = j;
    }
    public int getEnergy(){
        return energy;
    }
    public int getCost(){
        return cost;
    }

    @Override
    public String toString() {
        return name;
    }

}
