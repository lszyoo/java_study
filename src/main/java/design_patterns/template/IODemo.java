package design_patterns.template;

import java.io.*;

/**
 * @author liushuai
 * @create 2020/5/8
 */
public class IODemo extends GetTime {
    @Override
    public void code() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.avi"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.avi"));
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
            bos.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
