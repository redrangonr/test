package Quanly;

public class Human {
    private String name;
    private String date;
    private String CMND;


    public Human(String name, String date, String CMND) {
        this.name = name;
        this.date = date;
        this.CMND = CMND;
    }
    public Human(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "Quanly.Human{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", CMND='" + CMND + '\'' +
                '}';
    }
}
