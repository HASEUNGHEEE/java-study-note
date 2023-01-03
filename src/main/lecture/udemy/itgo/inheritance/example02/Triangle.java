package lecture.udemy.itgo.inheritance.example02;

public class Triangle extends Shape {
    Point[] points; // 객체 배열

    public Triangle() {
        this(new Point(0, 0), new Point(50, 50), new Point(100, 100));
    }

    public Triangle(Point p1, Point p2, Point p3) {
        System.out.println("Triangle 의 매개변수 3개 호출");
        this.points = new Point[] {p1, p2, p3};
    }

    public Triangle(Point[] points) {
        System.out.println("Triangle 의 매개변수 points 호출");
        this.points = points;
    }

    @Override
    public void draw() {
        System.out.println("[p1] : " + this.points[0].x + ", " + this.points[0].y);
        System.out.println("[p2] : " + this.points[1].x + ", " + this.points[1].y);
        System.out.println("[p3] : " + this.points[2].x + ", " + this.points[2].y);
    }
}
