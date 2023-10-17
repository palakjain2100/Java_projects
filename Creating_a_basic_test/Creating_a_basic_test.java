import java.util.Scanner;
public class creating_a_basic_test {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //creating a basic test
        //We are going to be asking the user a set of questions
        //if the user provide the correct answer we
        //are going to move them to the next question
        //if not we are going to tell them to try again
        System.out.println("What is yor name?");
        String name = sc.next();
        System.out.println("Hello!"+ name +",Welcome to the test!");
        System.out.println("Question1: What is 2+2 in letters?");
        String ans1 = sc.next();
        while (!ans1.equals("four")){
            System.out.println("You had the wrong answer. Try again! What is 2+2 in letters");
            ans1 = sc.next();
        }
        System.out.println("Great! Thats the correct answer.");
        System.out.println("Question2:What is the capital of Canada?");
        String ans2 = sc.next();
        while (!ans2.equals("Toranto")){
            System.out.println("You had the wrong answer.Try again! What is the capital of Canada");
            ans2 = sc.next();
        }
        System.out.println("Great! You have passed the test");
    }
}