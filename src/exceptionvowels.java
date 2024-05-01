import java.util.Scanner;
class NoVowelsException extends Exception {
    public NoVowelsException(String message){
        super(message);
    }
}
public class exceptionvowels {

    public static void checkVowel(String text)throws NoVowelsException{
        boolean checker = false;
        String vowels ="aeiouAEIOU";
        for (int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                checker=true;
                break;
            }

        }
        if(!checker){
            throw new NoVowelsException("String does not contain any vowel.");
        }
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        try {
            String text = sc.nextLine();
            System.out.println("Original message :"+text);
            checkVowel(text);
            System.out.println("String contains vowels.");
        }catch(NoVowelsException e){
            System.out.println("Error :"+e.getMessage());
        }
    }

}

