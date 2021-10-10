public class Uzd4 {
    public static void main(String[] args) {
        int[] masivs = {1, 7, 3, 10, 9};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < masivs.length; i++) {
            if (masivs[i] % 2 == 0) {
                even = even + 1;
            } else {
                    odd = odd + 1;
            }
        }
        System.out.println("count of even: " + even);
        System.out.println("count of odd: " + odd);
    }
}
