package Algorithms.Implementation.Implementation8;

public class Bird {

    int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;

    public Bird(int type, int number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type=" + type +
                ", number=" + number +
                '}';
    }
}
