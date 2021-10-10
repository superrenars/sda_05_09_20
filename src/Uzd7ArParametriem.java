import java.util.Scanner;
    public class Uzd7ArParametriem {
        public static void main(String[] args) {

            int m[];
            int length;
            Scanner input = new Scanner(System.in);
            System.out.print("Ieraksti masiva garumu: ");
            length = input.nextInt();
            m = new int[length];

            for (int i = 0; i < m.length; i++) {
                System.out.print(String.format("[%d]: ", i, 2, 3)); //"[" + i + "]"
                m[i] = input.nextInt();
            }

            System.out.println("Pairs that form a sum of 4: ");
            for (int i = 0; i < m.length; i++) {
                for (int j = i + 1; j < m.length; j++) {
                    if (m[i] + m[j] == 4) {
                        System.out.print(m[i] + "-" + m[j] + " ");
                    }
                }
            }
        }
    }

