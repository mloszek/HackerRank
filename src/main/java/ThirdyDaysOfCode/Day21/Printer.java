package ThirdyDaysOfCode.Day21;

public class Printer<T> {

    public Printer() {
    }

    public void printArray(T[] array) {

        for (Object o : array) {
            System.out.println(o);
        }
    }
}