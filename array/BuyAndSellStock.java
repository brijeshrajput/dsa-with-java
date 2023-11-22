class BuyAndSellStock {

    public static void maxProfit(int arr[]) {
        int n = arr.length;

        int bp = Integer.MAX_VALUE; //min
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (bp > arr[i]){
                bp = arr[i];
            }
            int p = arr[i] - bp;
            if (p > profit) {
                profit = p;
            }

            System.out.println(arr[i] + " - " + bp + " = " + p);

        }

        System.out.print(profit);
    }
    public static void main(String args[]) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        maxProfit(arr);
    }
}
