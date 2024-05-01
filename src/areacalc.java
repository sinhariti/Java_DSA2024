class shapes {
    public double calculateArea(){
        return 0;
    }
}
class circle extends shapes{
    private double radius;

    //constructors
    public circle(){
        radius=0;
    }
    public circle(double radius){
        this.radius= radius;
    }
    public double getcircle(){
        return this.radius;
    }
    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }
}
class rectangle extends shapes{
    private double length,breadth;
    public rectangle(){
        length  =0;
        breadth =0;
    }
    public rectangle(int l,int b){
        length  =l;
        breadth =b;
    }

    @Override
    public double calculateArea() {
        return (length*breadth);
    }
}
class triangle extends shapes {
    private double base, height;
    public triangle(){
        base=0;
        height=0;
    }
    public triangle(int b, int h){
        base=b;
        height=h;
    }

    @Override
    public double calculateArea() {
        return (0.5*base*height);
    }
}
public class areacalc{
    public static void main(String[] args){
        circle c1 = new circle(5);
        System.out.println("The area of circle of radius "+c1.getcircle()+" is :"+c1.calculateArea());
        rectangle r1= new rectangle(4,5);
        System.out.println("The area of rectangle is :"+r1.calculateArea());
        triangle t1 =new triangle(3,4);
        System.out.println("The area of triangle is :"+t1.calculateArea());
    }
}
