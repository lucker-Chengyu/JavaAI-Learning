import java.util.Random;
public class Day07_random {
    static void main() {
        Random r = new Random();
       int number1 = r.nextInt(10);
       int number2 = r.nextInt(1,100);
        System.out.println("随机生成了：" + number1);
        System.out.println("随机生成了：" + number2);
    }
}
