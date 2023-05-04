package ejercicio41;

public class Mayor {
    public static double encontrarMayor(String s) {
        String[] nums = s.split(",");
        double max = Double.valueOf(nums[0]);
        int i;
        for (i = 0; i < nums.length; i++) {
            double n = Double.valueOf(nums[i]);
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
