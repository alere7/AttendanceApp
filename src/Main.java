import java.util.ArrayList;
import java.util.Random;

public class Main {

    /**
     * ralex1 on 1/10/2018.
     */
        public static ArrayList<Integer> rollcall;
        public static int absences;
        public static int num = 8;

        //Milestone 1 ==> absences
        private static ArrayList<Integer> attendence(){
            rollcall = new ArrayList<>();
            Random rand = new Random();

            for (int i = 0; i < num; i++) {
                absences = rand.nextInt(20)+1;
                rollcall.add(absences);
            }

            return rollcall;
        }

        private static ArrayList<Integer> getRollcall() {
            return rollcall;
        }

        private static void setRollcall(ArrayList<Integer> rollcall) {
            Main.rollcall = rollcall;
        }

    public static void main(String[] args) {
        System.out.println("\n\nHi, AttendanceApp!\n");

        System.out.println("## The Problem Statement ##");
        System.out.println("absences: " + attendence());
    }
}
