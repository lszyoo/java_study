package datastruct;

/**
 * 线性表的顺序存储结构：数组
 */
public class Struct_1_OrderLiner {
    // 用来保存数据的数组
    private String[] arrs;
    // 数组的默认大小
    private static final int DEFAULT_SIZE = 10;
    // 数组的大小
    private int maxSize;
    // 线性表的大小
    private int size;

    public Struct_1_OrderLiner() {
        this(DEFAULT_SIZE);
    }

    public Struct_1_OrderLiner(int size) {
        maxSize = size;
        arrs = new String[maxSize];
    }

    // 往线性表中指定位置插入数据
    public void insert(int i, String str) {
        // 1.参数校验
        if (i < 0) {
            throw new IllegalArgumentException("i不能小于0");
        }
        if (i > size) {
            throw new IllegalArgumentException("当前线性表的大小为" + size + ",i的最大值不能超过" + size + ",i目前是" + i);
        }

        // 2.根据情况改变数组长度
        String[] newArrs;
        String[] oldArrs;
        if (size == maxSize) {
            // 数组已经满了，需要改变长度
            oldArrs = arrs;
            newArrs = new String[(int) (maxSize * 1.5)];
            for (int j = 0; j < size; j++) {
                newArrs[j] = oldArrs[j];
            }
            maxSize = (int) (maxSize * 1.5);
            arrs = newArrs;
        }

        // 3.插入到末尾的处理
        if (i == size) {
            arrs[i] = str;
            size++;
            look();
            return;
        }

        // 3.移动位置
        for (int j = size; j > i; j--) {
            arrs[j] = arrs[j - 1];
        }

        // 4.插入数据
        arrs[i] = str;
        size++;
        look();
    }

    // 移除线性表指定位置上的数据
    public void remove(int i) {
        // 1.参数校验
        if (i < 0) {
            throw new IllegalArgumentException("i不能小于0");
        }
        if (i >= size) {
            throw new IllegalArgumentException("当前线性表的大小为" + size + ",i的最大值不能大于等于" + size + ",i目前是" + i);
        }

        // 2.移除
        arrs[i] = null;

        // 3.末尾的处理
        if (i == size - 1) {
            size--;
            look();
            return;
        }

        // 3.一般情况的处理
        for (int j = i; j < size - 1; j++) {
            arrs[j] = arrs[j + 1];
        }

        // 4.最后一位置空
        arrs[size - 1] = null;
        size--;
        look();
    }

    // 清空数据
    public void clear() {
        if (arrs != null) {
            for (int i = 0; i < size; i++) {
                arrs[i] = null;
            }
        }
        size = 0;
        look();
    }

    // 查看数据
    private void look() {
        if (arrs != null) {
            System.out.println("");
            for (int i = 0; i < arrs.length; i++) {
                System.out.print(" " + arrs[i]);
            }
        }
    }
}
