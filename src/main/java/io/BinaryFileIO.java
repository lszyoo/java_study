package io;

import java.io.*;

/**
 * close 包含 flush 功能
 * 但是flush具备刷新完，还可以继续写操作，close执行完了就流关闭了，不能再写入，所以，不能用close来代替flush
 * flush 是把读入内存的数据刷新到磁盘，并且清空内存的操作
 */
public class BinaryFileIO {
    public static void main(String[] args) throws IOException {
        // UTF-8 编码，一个汉字占用3个字节
        byte[] bytes = "中华人民共和国".getBytes("UTF-8");
        byte[] bytes1 = new byte[]{bytes[0], bytes[1], bytes[2]};
        System.out.println(new String(bytes1) + "=========");

        System.out.println(new File("").getAbsolutePath());
        // 输出：F:\code\java_study

        binaryFileWriter();
        binaryFileReader();
    }

    public static void binaryFileWriter() throws IOException {
        byte[] bytes = "中华人民共和国".getBytes("UTF-8");
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        FileOutputStream fos = new FileOutputStream(new File("").getAbsolutePath() + "\\src\\main\\java\\io\\binary_file");
        fos.write(bytes);
        // fos.flush();
        fos.close();
    }

    public static void binaryFileReader() throws IOException {
        FileInputStream fis = new FileInputStream(new File("").getAbsolutePath() + "\\src\\main\\java\\io\\binary_file");
        int c;
        byte[] bytes = new byte[3];
        while ((c = fis.read(bytes)) != -1) {
//            bytes
            System.out.println();
        }
    }
}
