import cache.PersonCallable;
import com.google.common.cache.CacheBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class SystemTest {
    public static void main(String[] args) throws ExecutionException {
        PersonCallable p = new PersonCallable();
        System.out.println("=======" + CacheBuilder.newBuilder().build().get(p, p));
        String cmd = "ls /";
        String[] cmds = new String[]{"ls /Users/gengmei/gengmei/platform/data-exchange/src/data-exchange", ""};
        try {
            Process ps = Runtime.getRuntime().exec(cmds);

            InputStream is = ps.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            ps.waitFor();
            is.close();
            reader.close();
            ps.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String abc = null;
        if (abc == null) {
            System.out.println(1);
        }
    }
}
