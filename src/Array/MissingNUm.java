package Array;
//2. Find the Missing Number
public class MissingNUm {
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
        int x = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
               x = i + 1;
        }
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 5, 6, 7 };
        int n = arr.length;
        findMissing(arr, n);
    }

 }
