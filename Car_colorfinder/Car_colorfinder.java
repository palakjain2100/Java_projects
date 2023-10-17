import java.util.Scanner;
public class Car_colorfinder{
    public static void main(String[]args){
        //creating a car color finder,basically entering a database
        //with car colors,using a for loop to check out each car
        //then using a if loop to find if the car is a certain color
        Scanner sc = new Scanner(System.in);
        String[]Data=new String[5];
        Data[0]="red";
        Data[1]="blue";
        Data[2]="yellow";
        Data[3]="blue";
        Data[4]="grey";
        for (int i=0;i<Data.length;i++){
            if (Data[i].equals("blue")) {
                System.out.println("Car number" + i + "is blue");
            }
            else{
                System.out.println("car number"+i+"is not blue");
                }


        }


    }
}