package Calculator;

//public class switch_statement {
//
//    public static void main(String[] args) {
//        int day = 0;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Holidays");
//                break;
//            default:
//                System.out.println("Invalid day");
//                break;
//        }
//    }
//}


//import java.util.Scanner;
//
//public class switch_statement {
//
//    public static void main(String[] args) {
//        int day;
//        System.out.println("Enter a number: ");
//        Scanner dayScan = new Scanner(System.in);
//        day = dayScan.nextInt();
//        
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//        }
//    }
//}
import java.util.Scanner;

public class switch_statement {

    public static void main(String[] args) {
        char letter;
        System.out.println("Enter a letter: ");
        Scanner letterscan = new Scanner(System.in);
        letter = letterscan.next().charAt(0);
        
        switch (letter){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");          
        }
    }
}


//public class switch_statement {
//
//    public static void main(String[] args) {
//        char ch = 'i';
//        switch (ch) {
//            case 'a':
//            case 'A':
//            case 'e':
//            case 'E':
//            case 'i':
//            case 'I':
//            case 'o':
//            case 'O':
//            case 'u':
//            case 'U':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Not a vowel");
//        }
//    }
//}


//int price + switch (coffee){
//case "l", "bc" -> 15;
//case "l", "mc" -> 20;
//default-> 0;
//}