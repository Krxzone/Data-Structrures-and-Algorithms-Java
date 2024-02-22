import java.util.*;

public class chk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Greatest of three numbers \n2. Check if entered alphabet is lower case or uppercase \n3. Check each character in a string");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int max = a;
                if (b > max)
                    max = b;
                if (c > max)
                    max = c;
                System.out.print("Maximum element is " + Math.max(c, Math.max(a, b)));
                break; // Add break statement to exit the switch

            case 2:
                char x = sc.next().charAt(0);
                if ((int) x > 96 && (int) x < 123) {
                    System.out.println(x + " is lowercase");
                } else {
                    System.out.println(x + " is uppercase ");
                }
                break; // Add break statement to exit the switch

            case 3:
                sc.nextLine(); // Consume the newline character
                String s = sc.nextLine();
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (Character.isLowerCase(ch)) {
                        System.out.println(ch + " is lowercase");
                    } else if (Character.isUpperCase(ch)) {
                        System.out.println(ch + " is uppercase");
                    } else {
                        System.out.println(ch + " is a special character");
                    }
                }
                break; // Add break statement to exit the switch

            default:
                System.out.println("Invalid choice");
        }
    }
}
