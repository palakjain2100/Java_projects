import java.util.Scanner;
public class average_to_gpa_converter {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //creating an average to gpa genarator
        //ask the user to enter number of courses he has
        //creating an array to enter grades for each of this courses
        //calculate the average and give grades
        System.out.println("How many courses you had this semester?");
        int a=sc.nextInt();
        double sum = 0;
        double[]Data=new double[a];
        for ( a=0;a<Data.length;a++){

            System.out.println("Enter your average for the course"+(a+1)+":" );
            Data[a]=sc.nextDouble();
        }
        for (a=0;a<Data.length;a++){
             sum = sum + Data[a];
        }
        double average =sum/Data.length;
        if (average>=90){
            System.out.println("Your garde is A");
        }
        else if(average>=80 && average<90){
            System.out.println("Your grade is B");
        }
        else if(average>=70 && average<80){
            System.out.println("Your grade is C");
        }
        else if(average>=60 && average<70){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("You have failed");
        }


    }

}