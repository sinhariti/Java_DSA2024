class outer {
    String name="Raj";
    class inner {
        void msg(){
            System.out.println("Name :"+name);
        }
    }
}
public class nestedclass {
    public static void main(String[] args){
        outer o1= new outer();
        outer.inner o2= o1.new inner();
        o2.msg();
    }
}
