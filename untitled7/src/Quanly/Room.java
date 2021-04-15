package Quanly;

public class Room {
    private String date;
    private int price;
    private String kind;
    private Human[] human;

    public Room(String date, int price, String kind, Human[] human) {
        this.date = date;
        this.price = price;
        this.kind = kind;
        this.human = human;
    }
    public Room(){

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Human[] getHuman() {
        return human;
    }

    public void setHuman(Human[] human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "date='" + date + '\'' +
                ", price=" + price +
                ", kind='" + kind + '\'' +
                ", human=" + human +
                '}';
    }
}
