package java_1121.method;

public class Rectangle {
    public int width;
    public int height;
    
    public Rectangle() {};
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }


    public void setDimension(int a, int b) {
        width = a;
        height = b;
        return;
    }
    public void getArea(int a, int b) {
        System.out.println("사각형의 면적 : "+(width*height));
        System.out.println("정사각형의 면적 : " + (width*width));

        return;
    }
    public void getPerimeter(int a, int b) {
        System.out.println("사각형의 둘레 : "+((width*2)+(height*2)));
        System.out.println("정사각형의 둘레 : "+(width*4));
        return;
    }


}
