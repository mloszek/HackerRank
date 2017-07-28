package ThirdyDaysOfCode.Day13;

class MyBook extends Book{

    private int price;

    public MyBook(String title, String author, int cash) {
        super(title, author);
        this.price = cash;
    }

    @Override
    void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}
