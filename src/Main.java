import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

        private static void printRollcall(){
            System.out.print("absences: ");
            for (int i = 0; i < rollcall.size(); i++) {
                if (i == rollcall.size()-1)
                    System.out.print(rollcall.get(i));
                else
                    System.out.print(rollcall.get(i)+ ", " ) ;
            }
        }

        private static int countElements(ArrayList<Integer> rc){
            Scanner in = new Scanner(System.in);
            int total = 0;
            int i;

            //todo: until i figure out whos absences i should be counting, do i do it by counting random indexes?


            return total;
        }


    public static void main(String[] args) {
        System.out.println("\n\nHi, AttendanceApp!\n");

        System.out.println("## The Problem Statement ##");
        attendence();
        printRollcall();
    }
}
