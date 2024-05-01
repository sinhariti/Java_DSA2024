abstract class GeometricShape{
    abstract double area();
    abstract double perimeter();
}
class Triangle1 extends GeometricClass{
    private double base,height;
    private double s1,s2,s3;
    public Triangle1(double base,double height,double s1,double s2,double s3){
        this.base=base;
        this.height=height;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    double area(){
        return (0.5*base*height);
    }
    double perimeter(){
        return(s1+s2+s3);
    }
}
class Square extends GeometricClass{
    private double side;
    public Square(int side){
        this.side=side;
    }
    double area(){
        return(side*side);
    }
    double perimeter(){
        return (side*4);
    }
}
public class GeometricClass {
    public static void main(String[] args){
        Square s1= new Square(5);
        System.out.println("The are of square :"+s1.area()+"\nThe perimeter of the Square is: "+s1.perimeter());
        Triangle1 t1= new Triangle1(4,5,1,2,3);
        System.out.println("The are of Triangle : "+t1.area()+"\nThe perimeter of the Triangle is: "+t1.perimeter());
    }
}
