package que3;

public class Book {

    private String title;
    private String auther;
    private int price;

    public Book() {
        this.title="Unknown";
        this.auther="Unknown";
        this.price=0;
    }

    // 2 Para
    public Book(String auther, String title) {
        this.auther = auther;
        this.title = title;
        this.price = price;
    }
    // 3 Para
    public Book(String auther, String title, int price) {
        this.auther = auther;
        this.title = title;
        this.price = price;
    }


    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
