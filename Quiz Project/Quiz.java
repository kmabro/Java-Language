import java.util.Scanner;

class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to JAVA Quiz Application!");

        Questions.displayGuidelines();

        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();

        Questions q = new Questions();
        q.start(userName);

    }

}
