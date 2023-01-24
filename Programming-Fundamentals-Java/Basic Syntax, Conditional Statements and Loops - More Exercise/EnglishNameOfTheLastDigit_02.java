import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(englishNameOfTheLastDigit(number));
    }

    public static String englishNameOfTheLastDigit(int num) {
        int lastDigit = num % 10;
        String lastDigitEnglishName = "";

        switch (lastDigit) {
            case 0:
                lastDigitEnglishName = "zero";
                break;
            case 1:
                lastDigitEnglishName = "one";
                break;
            case 2:
                lastDigitEnglishName = "two";
                break;
            case 3:
                lastDigitEnglishName = "three";
                break;
            case 4:
                lastDigitEnglishName = "four";
                break;
            case 5:
                lastDigitEnglishName = "five";
                break;
            case 6:
                lastDigitEnglishName = "six";
                break;
            case 7:
                lastDigitEnglishName = "seven";
                break;
            case 8:
                lastDigitEnglishName = "eight";
                break;
            case 9:
                lastDigitEnglishName = "nine";
                break;
        }
        return lastDigitEnglishName;
    }
}
