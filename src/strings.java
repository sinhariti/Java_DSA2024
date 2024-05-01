public class strings {
    public static void main(String[] args){
        String ob= "Java";
        String obj1="Raj143";
        String obj2= obj1.substring(0,1).toLowerCase().concat(obj1.substring(1,3).toUpperCase().concat(obj1.substring(3,6)));
        System.out.println(obj2);
        char[] arr = new char[obj2.length()];
        for(int i =0;i< obj2.length();i++){
            arr[i]= obj2.charAt(i);
        }
        System.out.println(arr[3]+arr[0]+arr[1]+arr[2]+arr[4]+arr[5]);
//        String ob1= ob.toUpperCase();
//        String ob2= ob.toUpperCase().substring(1,3);
//        String ob3=ob.substring(1,2).concat(ob.substring(2,3).toUpperCase());
//        String ob4= ob.substring(0,2).concat(ob.substring(2,3).toUpperCase().concat(ob.substring(3,4)));//printing JaVa
//        System.out.println(ob1);
//        System.out.println(ob2);
//        System.out.println(ob3);
//        System.out.println(ob4);
    }
}
