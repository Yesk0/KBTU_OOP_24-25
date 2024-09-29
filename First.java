interface P1 {

    default void show()
    {
        System.out.println("p1");
    }
}

interface P2 {

    default void show()
    {
        System.out.println("p2");
    }
}
interface P3 {

    default void show()
    {
        System.out.println("p3");
    }
}
class First implements P1, P2,P3 {

    @Override
    public void show()
    {
        P1.super.show();
        P2.super.show();
        P3.super.show();

    }
    public void showP1() {
        P1.super.show();
    }

    public void showP2() {
        P2.super.show();
    }

    public void showP3() {
        P2.super.show();
    }

    public static void main(String args[])
    {

        First d = new First();
        d.show();
        d.showP1();
        d.showP2();
        d.showP3();
    }
}


