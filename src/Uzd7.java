public class Uzd7 {
    public static void main(String[] args) {
        int m[] = {9,2,1,7,3,10,2};

        for(int i = 0; i<m.length; i++) {
            for(int j=i+1; j<m.length; j++) {
                if(m[i]+m[j]==4) {
                    System.out.print(m[i]+"-"+ m[j]+" ");

                }
            }
        }
    }
}
