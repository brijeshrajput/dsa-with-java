public class TrappedRainWater {

    public static void trappedRainWater(int arr[]) {
        int l = arr.length;
        //auxlary array- left max
        int leftMax[] = new int[l];
        leftMax[0] = arr[0];
        for (int i = 1; i < l; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //auxlary array- right max
        int rightMax[] = new int[l];
        rightMax[l-1] = arr[l-1];
        for (int i = l-2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int totalRainWater = 0;

        //loop
        //traped rainwater = rainwater - height
        // rainwater = min(maxLeft, maxRight)
        for (int i = 0; i < l; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            int trappedRainWater = waterlevel - arr[i];
            totalRainWater = totalRainWater + trappedRainWater;
        }

        System.out.print(totalRainWater);
    }
    public static void main (String args[]) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        trappedRainWater(arr);
    }
}
