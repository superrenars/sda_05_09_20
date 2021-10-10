public class Uzd1 {
    public static void main(String args[]) {
        int[] myArray = {1, 7, 3, 10, 9};
        double avg = 0;
        for (int i = 0; i < myArray.length; i++) {
            avg += myArray[i];
        }
        avg = avg / myArray.length;
        System.out.println(avg);
    }
}
