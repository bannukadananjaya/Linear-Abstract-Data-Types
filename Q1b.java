import java.util.Scanner;
import java.util.Stack;
//import java.util.*;

public class Q1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string to reverse :");
        String word = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        } 
    }
    
}
