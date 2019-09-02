package cache;

import java.util.concurrent.Callable;

public class PersonCallable implements Callable<Person> {
    Person p;

    /**
     * 下面代码自动加载到内存中
     * @return
     * @throws Exception
     */
    @Override
    public Person call() throws Exception {
        p = new Person("xiaoming", "18");
        return p;
    }
}
