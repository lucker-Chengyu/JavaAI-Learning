// java 里如果进行计算，整数与整数的计算结果只能为整数，整数与小数的计算结果只能为小数，除非结果前加int,double, String进行强制转换，此外整数与整数之间计算如果原本出现小数结果却是整数，这叫整数截断
// 此外String首字母必须大写
public class Day02_int_double_boolean {
    public static void main(String[] args) {
//        1. 分别声明 int、double、boolean、String 四种类型的变量并赋值
//        2. 演示整数除法陷阱：10/3 的结果是什么？为什么？
//        3. 演示字符串拼接：用 + 把你的名字和年龄拼成一句话打印出来
        int a = 3;
        System.out.println(a);
        double b = 3.1415926;
        System.out.println(b);
        boolean c = true;
        System.out.println(c);
        String d = "adjafkjahlf";
        System.out.println(d);
        int h = 10;
        double e = h/a;
        System.out.println(e);
        double j = 10.0/a;
        System.out.println(j);
        System.out.println("name: chengyu LIU,age = " + 24);

    }

}


