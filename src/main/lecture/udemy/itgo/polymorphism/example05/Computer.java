package lecture.udemy.itgo.polymorphism.example05;

public class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
