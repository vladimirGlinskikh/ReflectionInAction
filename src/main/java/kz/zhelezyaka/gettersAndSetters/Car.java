package kz.zhelezyaka.gettersAndSetters;

public class Car {
    private String name;
    private Object price;
    private Object year;

    public Car(String name, Object price, Object year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }
}
