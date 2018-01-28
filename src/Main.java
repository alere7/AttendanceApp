import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * ralex1 on 1/10/2018.
     */
        public static ArrayList<Integer> rollcall;
        public static int absences;
        public static int num = 8;
        static Scanner in = new Scanner(System.in);
        static Random rand = new Random();

        private static ArrayList<Integer> attendence(){
            rollcall = new ArrayList<>();

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
            for (int i = 0; i < rollcall.size(); i++) {
                if (i == rollcall.size()-1)
                    System.out.println(rollcall.get(i));
                else
                    System.out.print(rollcall.get(i)+ ", " ) ;
            }
        }

        private static int countElements(ArrayList<Integer> rc){
            int total = 0;
            int i;

            //todo: until i figure out whos absences i should be counting, do i do it by counting random indexes?


            return total;
        }

        private static ArrayList<Integer> updateElement(ArrayList<Integer> rc, int i, int newValue){
            rc.set(i, newValue);
            return rc;
        }

        private static ArrayList<Integer> sortElementsSTL(ArrayList<Integer> rc){
            //Collections.sort(rc);

            for (int i = 0; i < rc.size(); i++) {
                for (int j = 0; j < rc.size()-1; j++) {
                    int num1 = rc.get(i);
                    int num2 = rc.get(j);
                    if (rc.get(i) < rc.get(j)){
                        int temp = num1;
                        rc.set(i,num2);
                        rc.set(j, temp);
                    }
                }
            }
            return rc;
        }

        private static ArrayList<Integer> sortElementsLTS(ArrayList<Integer> rc){
            //Collections.reverse(rc);

            for (int i = 0; i < rc.size(); i++) {
                for (int j = 0; j < rc.size()-1; j++) {
                    int num1 = rc.get(i);
                    int num2 = rc.get(j);
                    if (rc.get(j) < rc.get(i)){
                        int temp = num1;
                        rc.set(i,num2);
                        rc.set(j, temp);
                    }
                }
            }
            return rc;
        }

        private static ArrayList<Integer> shuffleElements(ArrayList<Integer> rc){
            Collections.shuffle(rc, rand);
            return rc;
        }

        private static void makeAnUpdate(){
            System.out.println("Would you like to update one of the attendences?");
            String answer = in.next();

        }


    public static void main(String[] args) {
        System.out.println("\n\nHi, AttendanceApp!\n");

        System.out.println("### The Problem Statement ###");
        attendence();

        System.out.println("Original List:");
        printRollcall();



        updateElement(rollcall, 3, 13);
        System.out.println("Updated List:");
        printRollcall();

        sortElementsSTL(rollcall);
        System.out.println("Sorted List (Smallest to Largest):");
        printRollcall();

        sortElementsLTS(rollcall);
        System.out.println("Sorted List (Largest to Smallest):");
        printRollcall();

        shuffleElements(rollcall);
        System.out.println("Shuffled List:");
        printRollcall();
    }
}
