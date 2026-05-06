// Java 数组：类型固定，长度固定 Python 列表：类型随意，长度随意
public class Day4_for_while {
    public static void main(String[] arg) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
// while循环
        int m = 1;
        while (m <= 9) {
            int n = 1;
            while (n <= m) {
                System.out.print(n + "x" + m + "=" + m * n + "\t");
                n++;
            }
            System.out.println();
            m++;
        }
// 强for循环
        int[] nums = {1, 2, 3, 4, 5};
        for (int n : nums){
            System.out.println(n);
        }
        System.out.println("数组长度："+ nums.length);
// 普通for循环
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("数组长度："+ nums.length);
    }
}

