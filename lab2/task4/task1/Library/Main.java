package task1.Library;

public class Main
{
    public static void main(String[] args)
    {
        LibraryItem dvd = new DVD("One piece", "Eitiro oda", 1998, 123457);
        System.out.println(dvd.getTitle());
        System.out.println(dvd.getAuthor());
        System.out.println(dvd.getYear());
        System.out.println(((DVD) dvd).getDuration());
        System.out.println(((DVD) dvd).getItemType());

    }
}