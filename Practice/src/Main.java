import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner finalGrade = new Scanner(System.in);
        System.out.println("Enter your Age: ");

        int myAge = finalGrade.nextInt();

        if(myAge < 18 ){
            System.out.println("You are a minor");
        } else if(myAge <= 60 ){
            System.out.println("You are a adult");
        } else{
            System.out.println("You are a senior citizen");
        }
    }
}