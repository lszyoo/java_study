package primarytype;

/**
 byte,short,char—int—long—float—double
 byte,short,char之间不转换,他们参与运算首先转换为int类型
 A:案例演示
 面试题:看下面的程序是否有问题，如果有问题，请指出并说明理由。
 byte b1 = 3;
 byte b2 = 4;
 byte b3 = b1 + b2;
 byte b4 = 3 + 4;
 那么byte b5 = b1+1;   ?
 */
public class Demo1 {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        // byte b3 = b1 + b2;
        // 因为 byte参与运算的时候会转换成int类型 参与运算，得到的结果就是int类型，所以报错
        // b1和b2 是两个变量,变量存储的是变化 ,在编译的时候无法判断里面的值,相加有可能会超出byte的取值
        int b3 = b1 + b2;
        byte b4 = (byte) (b1 + b2);
        byte b5 = 3 + 4;
        // 编译器在处理常量相加与变量相加的时候，有不同的态度的
        // 变量时程序中会发生改变的量
        // 当你整数里有两个变量相加时，这个时候编译只知道你是变量，不知道你的结果，它将你的变量相加
        // b1+b2 当做 int类型来处理  这个时候（编译期）没办法做变量相加
        // 常量是在程序执行过程中其值不发生改变的量 3,4都是常量，编译器知道你是常量，既然你是常量那么
        // 在程序执行过程中就不会发生改变，所以对常量进行了优化，直接将常量相加的结果计算出来了
        // 得到了结果7 ，判断7是不是在byte范围内，在，所以成功。
        System.out.println(b5);

//        byte b5 = b1+1;
        //变量与常量相加相当于变量相加。
    }
}