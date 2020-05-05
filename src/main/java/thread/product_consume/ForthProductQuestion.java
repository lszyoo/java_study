package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class ForthProductQuestion implements Runnable {
    private ForthStudent fs;
    private int x = 0;

    public ForthProductQuestion(ForthStudent fs) {
        this.fs = fs;
    }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                fs.set("林青霞", 27);
            } else {
                fs.set("刘意", 30);
            }
            x++;
        }
    }
}
