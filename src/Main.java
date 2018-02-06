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
        public static String name;
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

        private static ArrayList<Integer> updateElement(ArrayList<Integer> rc){
            System.out.print("Would you like to update one of the attendences? (y/n) ");
            String answer = in.next();

            if (answer.equals("y")){
                System.out.print("Choose the absensce index to update: ");
                int i = in.nextInt();
                System.out.print("Give the new absent value: ");
                int newValue = in.nextInt();
                rc.set(i, newValue);
                return updateElement(rc);
            }
            else
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

        private static String scanUsersName(){
            name = in.next();
            return name;
        }

        private static String getUsersName(){
            return name;
        }

    public static void main(String[] args) {
        System.out.print("Please state your name: ");
        scanUsersName();
        System.out.println("Hi " + getUsersName() + ", Welcome to AttendanceApp!\n");

        attendence();

        System.out.println("Original List:");
        printRollcall();

        updateElement(rollcall);
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
