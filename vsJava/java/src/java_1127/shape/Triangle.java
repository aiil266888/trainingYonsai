package java_1127.shape;

public class Triangle extends Shape {
    double width, height;

    public Triangle(){
        this(0,0);
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        // (밑변 X 높이)/2
        return (width * height)/2;
    }

    @Override
    double round() {
        // 밑변 X 3
        return (width * 3);
    }
}
