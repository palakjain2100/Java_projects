import java.util.Scanner;
//Creating a program that asks user if they want a car
//If they say yes then asking which color of car
//Tf no then telling them to have a good day
public class Car_selector{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!Do you want a Car?");
        String a = sc.next();

        if (a.equals("Yes")||a.equals("YES")||a.equals("yes")) {
            System.out.println("Thats really amazing!");
            System.out.println("We offer three colors:Red,Blue and Green");
            System.out.println("Which one would you like to buy?");
            String b = sc.next();
            if (b.equals("Red" )||b.equals("RED" )||b.equals("Red" )){
                System.out.println("Thats a great choice!You will get your car delivered today.");
            } else if (b.equals("Blue" )||b.equals("BLUE" )||b.equals("blue" )) {
                System.out.println("Thats a great choice!You will get your car delivered today.");
            } else if (b.equals("Green" )||b.equals("GREEN" )||b.equals("green" )) {
                System.out.println("Thats a great choice!You will get your car delivered today.");
            } else {
                System.out.println("Sorry we dont have this option available currently");
            }
        }
        else{
            System.out.println("Have a great day!");
            }



    }
}