import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.print("Enter starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter ending index: ");
        int end = sc.nextInt();
        if (start >= 0 && end <= sb.length() && start < end) {
            sb.delete(start, end);
            System.out.println("Result: " + sb);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}
