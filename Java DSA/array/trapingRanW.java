public class TrappingRainWater {

    public static int trappingRainWater(int arr[]) {
        int h = arr.length;
        if (h == 0) return 0;

        int leftMax[] = new int[h];
        int rightMax[] = new int[h];

        int waterTrap = 0;

        // Fill leftMax
        leftMax[0] = arr[0];
        for (int i = 1; i < h; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Fill rightMax
        rightMax[h - 1] = arr[h - 1];
        for (int i = h - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate trapped water
        for (int i = 0; i < h; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            if (minHeight > arr[i]) {
                waterTrap += minHeight - arr[i];
            }
        }

        return waterTrap;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 3, 2, 5};
        System.out.println("Total trapped water: " + trappingRainWater(arr));
    }
}
