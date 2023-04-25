public class ass1Q1 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;

        // given code . . . 

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         sum++;
        //     }
        // }
        
        // improvement code . . . 
        sum = n*(n+1)/2;

        System.out.println(sum);
    }
}