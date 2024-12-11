package tests.browser;

public class MethodPractice {

    public static void main(String[] args) {




        MethodPractice.printMessage();
        printMessage("John");
        printMessage("Alex");
        printMessage("Killy");

        String message = "Hello World"; // Remove the space between the words!

        System.out.println( removeSpaces(message) );
        System.out.println( removeSpaces("Hello welcome to tekschool") );
        printStringWithRemovedSpaces("Hello Humans!");

        int result = sum(10,5);
        System.out.println( result );
        System.out.println( sum(20, 10) );
        printSum(35, 25);


        charactersInString("I love java!");
        char[] characters = charactersInString(message);
        printArray(characters);




    }

    public static void printMessage() {
        System.out.println("Hello Humans!");
    }

    public static void printMessage(String name) {
        System.out.println("Hello " + name );
    }

    public static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public static void printStringWithRemovedSpaces(String str) {
        System.out.println(str.replaceAll(" ", ""));
    }

    // 10 + 5 => 15
    // Should return the result
    // Should print the result of the addition

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        System.out.println( sum(a, b) );
    }

    // String str = "Hello Humans!";
    // Return an array of characters
    // Print each character of the String.
    public static char[] charactersInString(String str) {
 /*       return str.toCharArray();*/
        return removeSpaces(str).toCharArray();
    }


    public static void printArray(String[] arr ) {
        for ( String String : arr ) {
            System.out.println( String );
        }
    }


    public static void printArray(char[] arr ) {
        for ( char character : arr ) {
            System.out.println( character );
        }
    }





}
