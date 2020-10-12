import java.util.Scanner;
class Example17 {
    public static void main (String [] argv) {
        int hours,minutes,seconds;

        System.out.println("Enter hours");
        System.out.println("Enter minutes");
        System.out.println("Enter seconds");

        //Reading value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        hours = inputValue.nextInt();

        inputValue = new Scanner(System.in);
        minutes = inputValue.nextInt();

        inputValue = new Scanner(System.in);
        seconds = inputValue.nextInt();

        seconds = seconds + 1;

        System.out.println( hours + " Hours "+ minutes +" Minutes and "+  seconds + " Seconds ");

    }
}