public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
    }

    /**
     * Rain water problem
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        for(int i = 1; i < n ;i++){
            left[i] = Math.max(height[i], left[i-1]);
        }
        right[n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ;i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        int maxWater = 0;
        for(int i =0; i <n ;i++){
            int waterLevel = Math.min(left[i],right[i]);
            maxWater =maxWater + (waterLevel - height[i]);
        }
        return maxWater;
    }
}