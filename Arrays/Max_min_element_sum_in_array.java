import java.util.*;

public class Max_min_element_sum_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // using static method
        System.out.println(Solution.findSum(arr, N));
    }

}

class Solution {
    public static int findSum(int A[], int N) {
        // code here
        Arrays.sort(A);
        return A[0] + A[N - 1];
    }
}