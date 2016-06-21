import java.util.Scanner;

/**
 * Created by owlslubic on 6/21/16.
 */
public class function_lab {



        public static void main(String[] args) {

            parameterCount("animals", "minerals");
            stringLength("hohoho");
            longestString("hoh", "hoho");
            userInput();
            typeQuit();

            // int x = pC();
            // System.out.println(x);

            // System.out.println(pC());
        }


        public static void parameterCount(String... word){
            System.out.println(word.length);
            //return;

        }

        //public static int pC(){
        //    int eightyEight = 88;
        //    return eightyEight;
        //}

        public static void stringLength(String aString){

            System.out.println(aString.length());
        }

        public static void longestString(String strLength1, String strLength2){

            int str1 = strLength1.length();
            int str2 = strLength2.length();

            if(str1 > str2) {
                System.out.println(strLength1);
            }
            else {
                System.out.println(strLength2);
            }
        }

        public static void userInput(){
            System.out.println("Type something!");
            Scanner scanner = new Scanner(System.in);
            String uInput = scanner.nextLine();
            System.out.println(uInput);
        }
        public static void typeQuit(){
            System.out.println("Say hello to me!");
            Scanner scanner = new Scanner(System.in);
            String inputFromUser = scanner.nextLine();
            System.out.println(inputFromUser);

            if(inputFromUser.equals("quit")){
                System.out.println("bye");
            }
            else {
                typeQuit();
            }
        }



    }




