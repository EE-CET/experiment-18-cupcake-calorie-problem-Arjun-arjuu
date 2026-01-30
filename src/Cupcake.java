import java.util.*;

public class Cupcake {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // ascending

        long mile = 0;
        for (int i = 0; i < n; i++) {
            mile += (long) arr[i] * (1L << (n - 1 - i));
        }

        System.out.println(mile);
    }
}
