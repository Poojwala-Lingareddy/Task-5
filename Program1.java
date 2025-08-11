//Write a Java Program that to accept a user input(Scanner Class) of String and try to remove all the white spaces given within that String
import java.util.Scanner;
class space{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String st = sc.nextLine();
        String change = st.replace(" ", "");
        System.out.println(change);
    }
}