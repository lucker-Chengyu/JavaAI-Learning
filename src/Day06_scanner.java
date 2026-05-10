import java.util.Scanner;

public class Day06_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入年龄：");
        int age = sc.nextInt();
        System.out.println("年龄是" + age);
//        传统方法的到指定区间的随机数
//        nextInt(10) 生成 [0, 9]
//        [0, 9] + 1  = [1, 10] ✅
//        先算范围长度：17 - 3 + 1 = 15
//        nextInt(15) 生成 [0, 14]
//        [0, 14] + 3 = [3, 17] ✅
    }
}
