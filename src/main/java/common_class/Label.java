package common_class;

/**
 * label1:
 *      outer-iteration {
 *          inner-iteration {
 *              // ...
 *              break;      (1)
 *              // ...
 *              continue;   (2)
 *              // ...
 *              continue label1;    (3)
 *              // ...
 *              break label1;       (4)
 *          }
 *      }
 *
 *  (1) break 中断内部迭代，回到外部迭代
 *  (2) continue 使执行点回到内部迭代的起始处，忽略本次，开启下次迭代
 *  (3) 同时忽略内部和外部本次迭代，回到外部迭代，开启下次迭代
 *  (4) 同时停止内部和外部所有迭代
 */

public class Label {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (; true;) {
            inner:
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}

/*
    输出：
        1 = 0
        continue inner
        1 = 1
        continue inner
        1 = 2
        continue
        1 = 3
        break
        1 = 4
        continue inner
        1 = 5
        continue inner
        1 = 6
        continue inner
        1 = 7
        continue outer
        1 = 8
        break outer
 */