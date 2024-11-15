package practice6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private final List<Food> menu = new ArrayList<>(Arrays.asList(Food.Beer,Food.Pizza,Food.Burger,Food.Doner,Food.Airan,Food.Vodka));
    private int money = 0;
    Boolean buy(Food f,Person p){
        if (menu.contains(f)){
            if (p.money<f.getCost()){
                System.out.print(p.name+ " Has not nough money");
                return false;
            }
            p.money -= f.getCost();
            money +=f.getCost();

        }else {
            System.out.println("Restraunt doesnt sell "+f);
            return false;
        }
            return true;
    }
    public void getMenu(){
        for(Food i : menu){
            System.out.println(i+":"+i.getCost()+" energy "+i.getEnergy());
        }
    }
    public void getManey(){
        System.out.print(money);
    }





}
