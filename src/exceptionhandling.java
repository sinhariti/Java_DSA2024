import org.w3c.dom.ls.LSOutput;//Exception handling is a mechanism to handle untime errors such as : ClassNotFoundException IOException
//What are the heirarchy of the exception handling
//try - used to specify a block where we should place an exception code.
//catch -  used to handle the exception.
//finally - whatever info is givent hat will be printed
//throw - instead of using sop, message can be passed using throw
//throws - entire main coding will be shown to the user if there is any error
//catch is always dependent on catch, can use more than one catch
//types of java exceptions :
class vote{
    void validate(int age){
        if(age<18){
            throw new ArithmeticException("person aint eligible") ;
        }
        System.out.println("person can vote");
    }
}
public class exceptionhandling {
    public static void main(String[] args)throws Exception{
        int a=10;
        int b=0;
        try{
            //first one will be exception after that the code will stop.
            vote v1= new vote();
            v1.validate(13);
            int x[]=null;
            System.out.println(x[3]);
            int c=a/b;
        }
        //Exception e - arithmetic exception
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("End");
        }

    }
}


