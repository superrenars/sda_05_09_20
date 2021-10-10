public class Uzd6 {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};
        int max, max2;
        if (myArray[0] >= myArray[1]) {
            max = myArray[0];
            max2 = myArray[1];
        } else {
            max = myArray[1];
            max2 = myArray[0];
        }

        for (int i = 2; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max2 = max;
                max = myArray[i];
            } else if (myArray[i] > max2) {
                max2 = myArray[i];
            }
        }

        System.out.println("Second largest element is " + max2);
    }
}
