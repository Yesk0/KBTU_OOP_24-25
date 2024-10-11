public class Super {
    public String str = "Super";

    public void show(){
        System.out.println("Super.show" + str);
    }
    public String getStr() {
        return str;
    }

}

class  Extended extends Super{
    public String str = "Extended";
    public void show(){
        System.out.println("Extended.show" + super.str);
    }
}
class Extended2 extends Extended{
    public String str = "Extended2";
    public void show(){
        System.out.println("Extended2.show" + super.str);
     }
    public static void main(String[] args) {
        Extended2 extended2 = new Extended2();
        Extended extended = extended2;
        Super Supeeer;
        Supeeer = extended;
        extended2.show();
        extended.show();
        Supeeer.show();
        System.out.println(extended2.str);
        System.out.println(extended.str);
        System.out.println(Supeeer.str);
    }

}
