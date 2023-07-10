import java.util.Scanner;

public class Main {
    public static String nameFile;
    public static String text;
    public static Scanner scanner = new Scanner(System.in);
    public static int resultChoice;


    public static void main(String[] args) {
        service();

    }
    public static void getDataFromUser() {
        System.out.println("Please enter a file name (No format)");
        nameFile = scanner.next();
        scanner.nextLine();
        System.out.println("Please enter the text to be written");
        text = scanner.nextLine();

    }

    public static void service() {
        boolean lock = true;
        while (lock) {
            System.out.println("""
                    Choose an action (Enter a number 1-3)
                                     
                     1. Write to file.
                     2. Read file.
                     3. Close.
                     """);
            if (scanner.hasNextInt()) {
                resultChoice = scanner.nextInt();
                if (resultChoice == 1) {
                    getDataFromUser();
                    informationWorkingWithMethods(FileWriteService.createFile(nameFile, text));
                } else if (resultChoice == 2) {
                    informationWorkingWithMethods(FileReadService.redFile(nameFile));
                } else {
                    System.out.println("Thanks, bye!");
                    lock = false;
                }
            } else {
                System.out.println("Invalid input! Please enter an integer value");
                scanner.nextLine();
            }
        }
    }
    public static void informationWorkingWithMethods(String information){
        System.out.println(information);
    }
}





