import java.util.Scanner;

class Cricket_Score_Tracker {

    Scanner sc = new Scanner(System.in);

    int overs_played() {
        System.out.print("Enter number of overs played :      ");
        int overs = sc.nextInt();
        return overs;
    }

    int wickets_lost() {
        System.out.print("Enter number of wickets lost :      ");
        int wickets = sc.nextInt();
        return wickets;
    }

    int runs_scored() {
        System.out.print("Enter number of runs scored :       ");
        int runs = sc.nextInt();
        return runs;
    }

    int extra_runs() {
        System.out.println("   -----Enter number of extras-----     ");
        System.out.print("Enter number of wides :             ");
        int wides = sc.nextInt();
        System.out.print("Enter number of no-balls :          ");
        int no_balls = sc.nextInt();
        return wides + no_balls;
    }

    int boundaries() {
        System.out.println("   -----Number of boundaries-----     ");
        System.out.print("Enter number of fours :             ");
        int fours = sc.nextInt();
        System.out.print("Enter number of sixes :             ");
        int sixes = sc.nextInt();
        return fours + sixes;
    }

    public static void main(String[] args) {

        Cricket_Score_Tracker tracker = new Cricket_Score_Tracker();
        System.out.println("\t\t\t-------------------------");
        System.out.println("\t\t\t| Cricket Score Tracker |");
        System.out.println("\t\t\t-------------------------");

        System.out.println();
        System.out.println("\t\t\t   **Enter details below**");
        System.out.println();
        int overs = tracker.overs_played();
        int runs = tracker.runs_scored();
        int wickets = tracker.wickets_lost();
        int extras = tracker.extra_runs();
        int boundries = tracker.boundaries();

        int total = runs + extras;

        System.out.println();
        System.out.println();
        System.out.println("\t\t\t      **Match Summary** ");
        System.out.println();
        System.out.println();
        System.out.println("Total overs : \t\t\t\t" + overs);
        System.out.println("Total score : \t\t\t\t" + total);
        System.out.println("Wickets lost : \t\t\t\t" + wickets);
        System.out.println("Extras : \t\t\t\t" + extras);
        System.out.println("Total Boundries : \t\t\t" + boundries);

    }
}