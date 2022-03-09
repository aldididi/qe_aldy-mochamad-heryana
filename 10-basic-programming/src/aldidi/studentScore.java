package aldidi;

import java.util.Scanner;

public class studentScore {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int finalScore, studentScore;
        char grade;


        //input
        System.out.println("Nilai :");
        studentScore = input.nextInt();

        //check Score
        if (studentScore >= 80 && studentScore <=100 ){
            System.out.println("A");
        } else if (studentScore >= 65 && studentScore <=79) {
            System.out.println("B+");
        } else if (studentScore >= 50 && studentScore <=64) {
            System.out.println("B");
        } else if (studentScore >= 35 && studentScore <=49) {
            System.out.println("C");
        } else if (studentScore >= 0 && studentScore <=34 ) {
            System.out.println("D");
        } else {
            System.out.println("Invalid");
        }
    }
}


//else {
//            System.out.println("D");
//        }

