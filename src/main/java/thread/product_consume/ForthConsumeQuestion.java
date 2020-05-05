package thread.product_consume;

/**
 * @author liushuai
 * @create 2020/5/4
 */
public class ForthConsumeQuestion implements Runnable {
    private ForthStudent fs;

    public ForthConsumeQuestion(ForthStudent fs) {
        this.fs = fs;
    }

    @Override
    public void run() {
        while (true) {
            fs.get();
        }
    }
}
