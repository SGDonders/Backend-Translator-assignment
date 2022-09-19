import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //<--array-->
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Zero"};

        //<--object-->
        Translator translator = new Translator(alphabetic,numeric);

        //<--body-->
        String invalid = "Invalid entry!";
        boolean play = true;

        while(play) {
            Scanner input = new Scanner(System.in);
            System.out.print("Type 'x' to quit or type 't' to translate numeric to alphabetic number: ");
            String inputUser = input.next();

            while (true) {
                if (Objects.equals(inputUser, "x")) {
                    play = false;
                    break;
                } else if (Objects.equals(inputUser, "t")) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Type a number from 0 to 9: ");
                    int number = scanner.nextInt();

                    if (number >10) {
                        System.out.println(invalid);
                    }else {
                        translator.translate(number);
                        break;
                    }
                }
            }
        }
    }
}
