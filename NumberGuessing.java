import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        System.out.println("---------- NUMBER GUESSING GAME ------------");
        System.out.println();

        System.out.println("Guess a number between 1 to 100");

        Scanner scanner = new Scanner(System.in);

        int tries=0, numberGuessed, comp;
        char response = 'y';
        comp = 1 + (int) (Math.random() * 100) ;

        while (response == 'y')
        {
            System.out.print("Enter the number : ");
            numberGuessed = scanner.nextInt();

            if (numberGuessed > comp){
                System.out.println("A bit lower!");
                tries++;
            } else  if(numberGuessed < comp){
                System.out.println("A bit higher!");
                tries++;
            } else {
                System.out.println("You guessed correct!! It's " + comp);
                tries++;
                System.out.println("You guessed in " + tries + " tries\n");
                System.out.print("Wanna play again (y/n) : ");
                response = scanner.next().charAt(0);
                comp = 1 + (int) (Math.random() * 100) ;
                tries=0;
            }
        }

        System.out.println("-------- THANK YOU FOR PLAYING WITH US ------------");


    }
}
