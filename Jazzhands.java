
public class Jazzhands {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {                    // count from 1 to 100
            if (((i % 3) == 0) && ((i % 5) == 0))            // A multiple of both?
                System.out.print("Jazzhands!");
            else if ((i % 3) == 0) System.out.print("Jazz"); // else a multiple of 3?
            else if ((i % 5) == 0) System.out.print("Hands"); // else a multiple of 5?
            else System.out.print(i);                        // else just print it
            System.out.print(" \n");                        // print each digit to a new line
        }
        System.out.println();
    }
}
