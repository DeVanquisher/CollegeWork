import java.util.Scanner;
import java.lang.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Number or String:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        //System.out.println(reverse);
        if(reverse.equals(str))
        {
            System.out.println(str+" is a palindrome.");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }

}
