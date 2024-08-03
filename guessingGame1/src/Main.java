//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);



        int countAttempts = 0;
        int maxAttempts = 5;
        boolean hasGuessed = false;

        while (countAttempts < maxAttempts) {
            System.out.print("Tentativa " + (countAttempts + 1) + ": Insira seu palpite: ");
            int guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("Parabéns! Você adivinhou!! (>‿◠)✌ ");
                hasGuessed = true;
                break;

            } else if (guessNumber < randomNumber) {
                System.out.println("O número é um pouco maior. Tente novamente.");
            } else {
                System.out.println("O número é um pouco menor. Tente novamente.");
            }

            countAttempts++;
        }


        if (!hasGuessed) {
            System.out.println("Número máximo de tentativas alcançado. O número era " + randomNumber + ".");
        }

        scanner.close();

    }



}