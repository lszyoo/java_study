package datatype;

/**
 * int类型 / int类型 = 取整    可强转，为double
 * int类型 / double类型 = double类型
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(5/2);            // 2
        System.out.println((double)5/2);    // 2.5
        System.out.println(5/1.5);          // 3.3333333333333335
    }
}