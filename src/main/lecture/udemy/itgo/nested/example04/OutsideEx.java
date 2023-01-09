package lecture.udemy.itgo.nested.example04;

public class OutsideEx {
    public static void main(String[] args) {
        Outside outside = new Outside();
        Outside.Inner inner = outside.new Inner();
        inner.showInfo();
    }
}
