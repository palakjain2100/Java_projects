import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
//We are creating a program that allows user to order food and drinks
//We are also confirming the order with the help of password created by the user
public class Hotel_order_project{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello! Welcome to the food app.");
        System.out.println("Please create a password:");
        String password = sc.next();
        System.out.println("Your password is:"+ password);
        System.out.println("Please enter your password:");
        String pass1 = sc.next();
        while (!pass1.equals(password)){
            System.out.println("Thats not correct.Please try again!");
             pass1=sc.next();
        }
        System.out.println("Access granted");
        System.out.println("Are you hungry(Yes/No)");
        String ans1 = sc.next();
        while (!ans1.equals("Yes")&& !ans1.equals("No")){
            System.out.println("Wrong command.Are you hungry(Yes/No)");
            ans1=sc.next();
        }
        if (ans1.equals("Yes")){
            System.out.println("Choose what would you want to eat between Pizza, Burger or Fish?");
            String ans2=sc.next();
            while (!ans2.equals("Pizza")&&!ans2.equals("Burger")&&!ans2.equals("Fish")){
                System.out.println("Sorry we do not have that available.What would you want to eat between Pizza, Burger or Fish?");
                ans2 = sc.next();
            }
            if (ans2.equals("Pizza")||ans2.equals("Burger")||ans2.equals("Fish")){
                System.out.println("Would you like to drink something(Yes/No)?");
                String ans5=sc.next();
                while(!ans5.equals("Yes")&&!ans5.equals("No")){
                    System.out.println("Sorry wrong command.Please try again ");
                    System.out.println("Would you like to drink something(Yes/No)");
                    ans5=sc.next();
                }
                if (ans5.equals("Yes")){
                    System.out.println("What would you like to drink between Water,Soda and Coke?");
                    String ans6=sc.next();
                    while (!ans6.equals("Water")&&!ans6.equals("Soda")&&!ans6.equals("Coke")){
                        System.out.println("Sorry we do not have that available.What would you want to drink between Water,Soda and Coke?");
                        ans6 = sc.next();
                    }
                    if (ans6.equals("Coke")||ans6.equals("Water")||ans6.equals("Soda")){
                        System.out.println("Great you have ordered "+ ans2 +" and " +ans6);
                    }
                }
                else if (ans5.equals("No")){
                    System.out.println("Alright! You have ordered "+ ans2);
                }

            }
            System.out.println("Please confirm your password.");
            String passtest=sc.next();
            while (!passtest.equals(password)){
                System.out.println("Thats not the correct password.Please try again.");
                passtest=sc.next();
            }
            if(passtest.equals(password)){
                System.out.println("Great!Your order will be ready soon.");
            }

        }
        else if (ans1.equals("No")){
            System.out.println("Would you like to drink something(Yes/No)?");
            String ans3=sc.next();
            if (ans3.equals("Yes")){
                System.out.println("What would you like to drink between Water,Soda and Coke?");
                String ans4=sc.next();
                while (!ans4.equals("Water")&&!ans4.equals("Soda")&&!ans4.equals("Coke")){
                    System.out.println("Sorry we do not have that available.What would you want to drink between Water,Soda and Coke?");
                    ans4 = sc.next();
                }
                if (ans4.equals("Water")||ans4.equals("Soda")||ans4.equals("Coke")){
                    System.out.println("You have oredered " + ans4);
                }
                System.out.println("Please confirm your password.");
                String passtest1=sc.next();
                while (!passtest1.equals(password)){
                    System.out.println("Thats not the correct password.Please try again.");
                    passtest1=sc.next();
                }
                if(passtest1.equals(password)){
                    System.out.println("Great!Your order will be ready soon.");
                }
            }
            else{
                System.out.println("Alright!Have a good day!");
            }
        }




    }
}