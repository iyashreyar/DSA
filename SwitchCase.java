import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit: ");
        String fruit = sc.next();

        switch(fruit){
            case "Mango" -> System.out.println("Sweet fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            case "Papaya" -> System.out.println("Large fruit");
            case "Banana" -> System.out.println("Yellow fruit");
            default -> System.out.println("Invalid fruit entered!");
        }
    }
}
