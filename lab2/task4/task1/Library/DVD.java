package task1.Library;

public class DVD extends LibraryItem {
    private int duration;
    public DVD(String title, String author, int year, int duration) {
        super(title, author, year);
        this.duration = duration;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getItemType()
    {
        return "DVD";
    }
}