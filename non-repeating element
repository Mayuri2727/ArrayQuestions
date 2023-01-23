package Array;
//3. Find first non-repeating element in a given Array of integers
public class NonRepeatingElement {
    static int NonRepeatingElement (int arr[], int n)
        {
            for (int i = 0; i < n; i++) {           //Check Element
                int j;
                for (j = 0; j < n; j++)             //check ith element present in array
                    if (i != j && arr[i] == arr[j])
                        break;
                if (j == n)
                    return arr[i];
                 }
              return -1;
             }
             public static void main(String[] args)
            {
                int arr[] = { 1, 4, 9, 6, 9, 4,6 };
                int n = arr.length;
                System.out.print(NonRepeatingElement(arr, n));
            }
        }


