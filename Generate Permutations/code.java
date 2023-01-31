import java.util.*;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        String a = "";
        for (int z = 0; z < n; z++) {
            a = a + arr[z];
        }
        permute(a, 0, n - 1);
    }
    private static void permute(String str, int l, int r) {
        if (l == r) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
            return;
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, i, l);
            permute(str, l + 1, r);
        }
    }
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
