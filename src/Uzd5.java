public class Uzd5 {
    public static void main(String[] args) {
        int[] masivs = {1, 7, 3, 7, 10, 1, 9};
        for (int i = 0; i < masivs.length; i++){
            for (int j = i+1; j < masivs.length; j++){
                if (masivs[i]==masivs[j]){
                System.out.println( "duplicate" + masivs[i]);
                break;
                }
            }
        }
    }
}
