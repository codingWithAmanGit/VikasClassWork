package dev.aman;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String reverse = "My name is Aman";


        String result = reverseLetterWise(reverse);
        System.out.println("The String is : " + reverse);
        System.out.println("Reversed String : " + result);

    }

    public static String reverseLetterWise(String reverse1) {
        String reverseLetter = "";

        for(int i = 0;i< reverse1.length();i++){
            reverseLetter = reverse1.charAt(i) + reverseLetter;
        }
        return reverseLetter;
    }


}
