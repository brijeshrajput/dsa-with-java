public class MaxSubArraySum {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void subarr(int arr[]){
        int f = 0;
        int l = arr.length - 1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= l; i++) {
            int start = i;
            for (int j = i; j <= l; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k]); //no
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.println("= "+ sum); //set
            }
            System.out.println(); //line
        }

        System.out.println("Max Sum is: " + maxSum);

    }

    //PrefixSum
    public static void prefixSum (int arr[]) {
        int f = 0;
        int l = arr.length - 1;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[l+1];

        prefix[0] = arr[0];
        for (int i = 1; i < l; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i <= l; i++) {
            int start = i;
            for (int j = i; j <= l; j++) {
                int end = j;
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
                
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.println("= "+ sum); //set
            }
            System.out.println(); //line
        }

        System.out.println("Max Sum is: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {2, -5, 8, 9, -15, -18};

        print(arr);
        subarr(arr);
        //prefixSum(arr);
    }
}
