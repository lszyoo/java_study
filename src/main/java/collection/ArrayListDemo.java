package collection;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList
    }
}
//        package java.util;
//
//        import java.util.function.Consumer;//导包
//        import java.util.function.Predicate;//导包
//        import java.util.function.UnaryOperator;//导包
//
//public class ArrayList<E> extends AbstractList<E>
//        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
////ArrayList继承AbstractList,实现了List,RandomAccess,Cloneable,java.io.Serializable接口
//{
//    private static final long serialVersionUID = 8683452581122892189L;
//    //成员变量，定义一个私有静态serialVersionUID的长整形常量
//    private static final int DEFAULT_CAPACITY = 10;
//    //成员变量，定义一个私有静态DEFAULT_CAPACITY的int型常量
//    private static final Object[] EMPTY_ELEMENTDATA ={};
//    //定义一个私有静态Object类型数组
//    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA ={};
//    //定义一个私有静态Object类型数组
//    transient Object[] elementData;//不懂，好像是建立了一个Object[]数组
//    private int size;
//    //定义一个私有int型变量
//    public ArrayList(int initialCapacity)//单参数构造方法
//    {
//        if (initialCapacity > 0) //若此参数大于0
//        {
//            this.elementData = new Object[initialCapacity];//匿名建立一个长度为参数的数组并赋给elementData数组
//        } else if (initialCapacity == 0) //若此参数为0
//        {
//            this.elementData = EMPTY_ELEMENTDATA;//将EMPTY_ELEMENTDATA数组赋值给elementData数组
//        }
//        else
//        {
//            throw new IllegalArgumentException("Illegal Capacity: "+
//                    initialCapacity);//不懂
//        }
//    }
//    public ArrayList()//无参构造
//    {
//        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;//将DEFAULTCAPACITY_EMPTY_ELEMENTDATA数组赋值给elementData数组
//    }
//    public ArrayList(Collection<? extends E> c)//单参数构造方法，collection的泛型为继承了E的任意类型
//    {
//        elementData = c.toArray();//将传进来的c变为数组
//        if ((size = elementData.length) != 0)//判断数组长度是否不为0
//        {
//            if (elementData.getClass() != Object[].class)
//                elementData = Arrays.copyOf(elementData, size, Object[].class);
//            //如果长度不为0但数组类型不是Object[]数组的，复制一个Object[]类型的elementData数组给elementData
//        }
//        else
//        {
//            this.elementData = EMPTY_ELEMENTDATA;//直接将EMPTY_ELEMENTDATA数组赋值给elementData
//        }
//    }
//    public void trimToSize()//成员方法
//    {
//        modCount++;//不知道这个是干啥的
//        if (size < elementData.length) //判断elementData数组的长度是否小于size
//        {
//            elementData = (size == 0)
//                    ? EMPTY_ELEMENTDATA
//                    : Arrays.copyOf(elementData, size);//条件表达式判断
//            //若小于再判断size的值是否为0，若不为0，复制一个长度为size的elementData数组给elementData数组
//            //若为0直接将EMPTY_ELEMENTDATA数组赋值给elementData
//        }
//    }
//    public void ensureCapacity(int minCapacity)//有参数的成员方法
//    {
//        int minExpand = (elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
//                ? 0
//                : DEFAULT_CAPACITY;
//        //条件表达式，定义一个int类型变量minExpand，判断elementData数组和DEFAULTCAPACITY_EMPTY_ELEMENTDATA数组
//        //是否相等，若相等给minExpand赋值0，若不等给minExpand赋值DEFAULT_CAPACITY=10
//
//        if (minCapacity > minExpand)//赋值后判断传进来的参数minCapacity是否大于minExpand
//        {
//            ensureExplicitCapacity(minCapacity);//若大于调用ensureExplicitCapacity方法。参数为minCapacity
//        }
//    }
//
//    private void ensureCapacityInternal(int minCapacity) //成员方法，判断要不要扩大容量
//    {
//        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)//判断elementData数组和 DEFAULTCAPACITY_EMPTY_ELEMENTDATA数组是否相等
//        {
//            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
//            //若相等则将DEFAULT_CAPACITY和传入的参数minCapacity较大的赋值给minCapacity
//        }
//
//        ensureExplicitCapacity(minCapacity);//调用ensureExplicitCapacity方法，参数为minCapacity
//    }
//
//    private void ensureExplicitCapacity(int minCapacity)//成员方法
//    {
//        modCount++;
//        if (minCapacity - elementData.length > 0)
//            grow(minCapacity);//grow是啥
//    }
//    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
//    //定义一个私有int型成员变量MAX_ARRAY_SIZE为ARRAY数组的最大大小为int类型最大值减去8
//    private void grow(int minCapacity) //成员方法
//    {
//        // overflow-conscious code
//        int oldCapacity = elementData.length;//将elementData数组长度赋值给oldCapacity
//        int newCapacity = oldCapacity + (oldCapacity >> 1);//将oldCapacity右移1位再加上oldCapacity赋值给newCapacity
//        if (newCapacity - minCapacity < 0)//如果minCapacity的值大于newCapacity
//            newCapacity = minCapacity;//将minCapacity的值赋值给newCapacity
//        if (newCapacity - MAX_ARRAY_SIZE > 0)//如果newCapacity的值大于ARRAY数组最大长度
//            newCapacity = hugeCapacity(minCapacity);//调用hugeCapacity方法并将返回值赋值给newCapacity
//        // minCapacity is usually close to size, so this is a win:
//        elementData = Arrays.copyOf(elementData, newCapacity);//复制长度为newCapacity的数组
//    }
//    private static int hugeCapacity(int minCapacity)//成员方法
//    {
//        if (minCapacity < 0)
//            throw new OutOfMemoryError();//若minCapacity小于0则出错
//        return (minCapacity > MAX_ARRAY_SIZE) ?
//                Integer.MAX_VALUE :
//                MAX_ARRAY_SIZE;
//        //判断minCapacity是否大于ARRAY数组最大长度，大于返回int类型最大值，小于则返回ARRAY数组长度
//    }
//    public int size()//成员方法
//    {
//        return size;//返回列表中元素数量
//    }
//    public boolean isEmpty()//成员方法
//    {
//        return size == 0;//若列表为空返回TRUE
//    }
//    public boolean contains(Object o)//列表中包含指定元素o返回true
//    {
//        return indexOf(o) >= 0;
//    }
//    public int indexOf(Object o)//成员方法，返回指定元素o的第一次出现的索引
//    {
//        if (o == null)//先判断是不是空元素
//        {
//            for (int i = 0; i < size; i++)//是空元素遍历集合查找
//                if (elementData[i]==null)
//                    return i;
//        }
//        else
//        {
//            for (int i = 0; i < size; i++)//不为空则遍历集合进行比较
//                if (o.equals(elementData[i]))
//                    return i;
//        }
//        return -1;//没有则返回-1
//    }
//    public int lastIndexOf(Object o) //返回最后出现的指定元素o的索引
//    {
//        if (o == null) //先判断是不是空元素
//        {
//            for (int i = size-1; i >= 0; i--)//是空元素从后往前遍历集合查找
//                if (elementData[i]==null)
//                    return i;
//        }
//        else
//        {
//            for (int i = size-1; i >= 0; i--)//不是空元素从后往前遍历一一比较
//                if (o.equals(elementData[i]))
//                    return i;
//        }
//        return -1;//没有则返回-1
//    }
//    public Object clone()//不懂
//    {
//        try
//        {
//            ArrayList<?> v = (ArrayList<?>) super.clone();
//            v.elementData = Arrays.copyOf(elementData, size);
//            v.modCount = 0;
//            return v;
//        } catch (CloneNotSupportedException e)
//        {
//            throw new InternalError(e);
//        }
//    }
//    public Object[] toArray() //返回包含该列表中所有元素的数组
//    {
//        return Arrays.copyOf(elementData, size);//返回一个复制的elementData大小的elementData数组
//    }
//    public <T> T[] toArray(T[] a)//返回一个数组,其中包含所有的元素在这个列表中
//    {
//        if (a.length < size)
//            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
//        System.arraycopy(elementData, 0, a, 0, size);//调用System中的方法
//        //从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
//        if (a.length > size)//如果传入的a长度大于集合
//            a[size] = null;
//        return a;
//    }
//    E elementData(int index)//成员方法，返回指定索引位置的元素
//    {
//        return (E) elementData[index];
//    }
//    public E get(int index) //成员方法，返回该列表中指定位置的元素。
//    {
//        rangeCheck(index);//调用rangeCheck方法判断范围
//        return elementData(index);//调用返回指定索引位置的元素的方法
//    }
//    public E set(int index, E element)//替换元素在这个列表中指定的位置
//    {
//        rangeCheck(index);//调用rangeCheck方法判断范围
//        E oldValue = elementData(index);//调用返回指定索引位置的元素的方法，将指定位置元素赋值给oldValue
//        elementData[index] = element;//将要替换的元素放入指定位置
//        return oldValue;
//    }
//    public boolean add(E e) //添加指定的元素的列表
//    {
//        ensureCapacityInternal(size + 1);//调用扩容方法
//        elementData[size++] = e;//将指定元素添加到最后
//        return true;
//    }
//    public void add(int index, E element)//在指定的位置插入指定的元素
//    {
//        rangeCheckForAdd(index);//判断要插入位置是否在集合内
//        ensureCapacityInternal(size + 1);//调用扩容方法
//        System.arraycopy(elementData, index, elementData, index + 1,
//                size - index);
//        //从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
//        //先在指定位置放一个空的元素
//        elementData[index] = element;//将指定元素放入刚才空元素中
//        size++;
//    }
//    public E remove(int index) //删除此列表中指定位置的元素
//    {
//        rangeCheck(index);//判断指定位置是否在集合中
//        modCount++;
//        E oldValue = elementData(index);//返回指定索引位置的元素给中间变量
//        int numMoved = size - index - 1;//确定要删除的元素索引位置
//        if (numMoved > 0)//若位置存在
//            System.arraycopy(elementData, index+1, elementData, index,
//                    numMoved);
//        elementData[--size] = null;//将其变为null完成移除
//        return oldValue;
//    }
//    public boolean remove(Object o)//删除这个列表中从指定元素第一次出现的位置开始
//    {
//        if (o == null)//若删除的是空元素
//        {
//            for (int index = 0; index < size; index++)//遍历集合
//                if (elementData[index] == null)//找到空元素所在位置索引
//                {
//                    fastRemove(index);
//                    return true;
//                }
//        }
//        else
//        {
//            for (int index = 0; index < size; index++)//指定元素不为空的情况下遍历集合
//                if (o.equals(elementData[index])) //比对指定位置的元素
//                {
//                    fastRemove(index);
//                    return true;
//                }
//        }
//        return false;
//    }
//    private void fastRemove(int index)//私有成员方法,不懂要做什么
//    {
//        modCount++;
//        int numMoved = size - index - 1;
//        if (numMoved > 0)
//            System.arraycopy(elementData, index+1, elementData, index,
//                    numMoved);
//        //12345  index=2  num=2 12345中3开始的45放到12345中3后面1234545
//        elementData[--size] = null; // clear to let GC do its work
//    }
//    public void clear()//从这个列表中删除所有元素
//    {
//        modCount++;
//        for (int i = 0; i < size; i++)//遍历集合，全变成null
//            elementData[i] = null;
//        size = 0;
//    }
//    public boolean addAll(Collection<? extends E> c)//将指定集合中的所有元素都添加到末尾
//    {
//        Object[] a = c.toArray();//将传进来的集合变为Object数组
//        int numNew = a.length;//求一下数组长度
//        ensureCapacityInternal(size + numNew);//给要被添加的集合扩容
//        System.arraycopy(a, 0, elementData, size, numNew);//将添加的集合复制到被添加集合的末端
//        size += numNew;//集合长度加上后来添加集合的长度
//        return numNew != 0;
//    }
//    public boolean addAll(int index, Collection<? extends E> c)//将指定集合中的所有元素插入到此
//    {
//        rangeCheckForAdd(index);//判断插入位置是否在集合内
//        Object[] a = c.toArray();//将要插入的集合变为数组
//        int numNew = a.length;//计算一下插入集合的长度
//        ensureCapacityInternal(size + numNew);//判断扩容
//        int numMoved = size - index;//判断插入位置
//        if (numMoved > 0)//插入位置在集合中则进行操作
//            System.arraycopy(elementData, index, elementData, index + numNew,
//                    numMoved);
//        //先将原来的集合变为加上插入集合后的长度
//        System.arraycopy(a, 0, elementData, index, numNew);
//        //将另外一个集合中的所有元素赋值到被插入集合的位置之后
//        size += numNew;//总长度加上插入集合长
//        return numNew != 0;
//    }
//    protected void removeRange(int fromIndex, int toIndex) //从这个列表中删除所有索引之间的元素
//    {
//        modCount++;
//        int numMoved = size - toIndex;
//        System.arraycopy(elementData, toIndex, elementData, fromIndex,
//                numMoved);
//        //【1，2，3，4，5，6，7】   35之间的5删除   numMoved=7-5=2  elementData=1234 675 67
//        int newSize = size - (toIndex-fromIndex);//5
//        for (int i = newSize; i < size; i++) //5到7
//        {
//            elementData[i] = null;
//        }
//        size = newSize;
//    }
//    //接下来的2个方法用来判断对集合操作的索引是否在集合范围内
//    void rangeCheck(int index) //私有成员方法
//    {
//        if (index >= size)//如果传入的索引值大于集合长度
//            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));//抛出一个错误提示
//    }
//    private void rangeCheckForAdd(int index) //私有成员方法，用来判断添加位置是否在集合内
//    {
//        if (index > size || index < 0)//大于集合长度小于0的索引均为错误
//            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));//抛出异常
//    }
//    private String outOfBoundsMsg(int index) //私有成员方法，返回索引和集合大小
//    {
//        return "Index: "+index+", Size: "+size;
//    }
//    public boolean removeAll(Collection<?> c) //从这个列表中删除所有包含在指定的集合中的元素
//    {
//        Objects.requireNonNull(c);//调用了Object中一个叫requireNonNull的静态方法
//        return batchRemove(c, false);
//    }
//    public boolean retainAll(Collection<?> c) //保留一个集合中另一个指定集合内存在的元素（交集）
//    {
//        Objects.requireNonNull(c);//调用了Object中一个叫requireNonNull的静态方法
//        return batchRemove(c, true);
//    }
//    private boolean batchRemove(Collection<?> c, boolean complement)
//    {
//        final Object[] elementData = this.elementData;//将非指定集合变为Object数组
//        int r = 0, w = 0;
//        boolean modified = false;
//        try
//        {
//            for (; r < size; r++)
//                if (c.contains(elementData[r]) == complement)
//                    elementData[w++] = elementData[r];
//        }
//        finally
//        {
//            if (r != size)
//            {
//                System.arraycopy(elementData, r,
//                        elementData, w,
//                        size - r);
//                w += size - r;
//            }
//            if (w != size)
//            {
//                for (int i = w; i < size; i++)
//                    elementData[i] = null;
//                modCount += size - w;
//                size = w;
//                modified = true;
//            }
//        }
//        return modified;
//    }
//    private void writeObject(java.io.ObjectOutputStream s)//看不懂
//            throws java.io.IOException{
//        int expectedModCount = modCount;
//        s.defaultWriteObject();
//        s.writeInt(size);
//        for (int i=0; i<size; i++) {
//            s.writeObject(elementData[i]);
//        }
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//    }
//    private void readObject(java.io.ObjectInputStream s)
//            throws java.io.IOException, ClassNotFoundException {
//        elementData = EMPTY_ELEMENTDATA;
//        s.defaultReadObject();//从此流读取当前类的非静态和非瞬态字段
//        s.readInt();//读取一个 32 位的 int 值
//        if (size > 0)
//        {
//            ensureCapacityInternal(size);
//            Object[] a = elementData;
//            for (int i=0; i<size; i++)
//            {
//                a[i] = s.readObject();//从 ObjectInputStream 读取对象赋值给数组
//            }
//        }
//    }
//    public ListIterator<E> listIterator(int index)
//    //返回一个列表迭代器在这个列表的元素(在适当的序列),从列表中指定的位置。
//    {
//        if (index < 0 || index > size)//判断索引是否在集合中
//            throw new IndexOutOfBoundsException("Index: "+index);//不在则抛出异常
//        return new ListItr(index);//匿名创建对象
//    }
//    public ListIterator<E> listIterator()//在这个列表中返回一个列表迭代器(在适当的情况下序列)。
//    {
//        return new ListItr(0);//匿名创建对象
//    }
//    public Iterator<E> iterator() //在这个列表中以适当的顺序返回一个迭代器
//    {
//        return new Itr();//匿名创建对象
//    }
//    private class Itr implements Iterator<E>
//            //第一个内部类Itr
//            //一个叫做Itr的成员内部类实现Iterator接口
//    {
//        int cursor;//迭代器索引
//        int lastRet = -1;
//        int expectedModCount = modCount;
//
//        public boolean hasNext()//内部类的成员方法，判断下一位是否有元素
//        {
//            return cursor != size;
//        }
//
//        @SuppressWarnings("unchecked")
//        public E next() //内部类的成员方法，用来输出下一位元素
//        {
//            checkForComodification();//并发修改异常检验
//            int i = cursor;
//            if (i >= size)//下一个元素大于集合长度爆出错误
//                throw new NoSuchElementException();
//            Object[] elementData = ArrayList.this.elementData;
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i + 1;
//            return (E) elementData[lastRet = i];
//        }
//
//        public void remove() {
//            if (lastRet < 0)
//                throw new IllegalStateException();
//            checkForComodification();
//
//            try {
//                ArrayList.this.remove(lastRet);
//                cursor = lastRet;
//                lastRet = -1;
//                expectedModCount = modCount;
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }
//
//        @Override
//        @SuppressWarnings("unchecked")
//        public void forEachRemaining(Consumer<? super E> consumer) {
//            Objects.requireNonNull(consumer);
//            final int size = ArrayList.this.size;
//            int i = cursor;
//            if (i >= size) {
//                return;
//            }
//            final Object[] elementData = ArrayList.this.elementData;
//            if (i >= elementData.length) {
//                throw new ConcurrentModificationException();
//            }
//            while (i != size && modCount == expectedModCount) {
//                consumer.accept((E) elementData[i++]);
//            }
//            cursor = i;
//            lastRet = i - 1;
//            checkForComodification();
//        }
//
//        final void checkForComodification()//判断修改是否正确
//        {
//            if (modCount != expectedModCount)//若迭代器不等于集合抛出并发修改异常
//                throw new ConcurrentModificationException();
//        }
//    }
//    private class ListItr extends Itr implements ListIterator<E>
//            //第二个内部类ListItr
//            //一个叫ListItr的成员内部类继承了Itr同时实现ListIterrator
//    {
//        ListItr(int index)//内部类的构造方法
//        {
//            super();
//            cursor = index;
//        }
//
//        public boolean hasPrevious()//内部类的成员方法，用来判断集合中下一个位置是否有元素
//        {
//            return cursor != 0;
//        }
//
//        public int nextIndex() //返回对 next 的后续调用所返回元素的索引
//        {
//            return cursor;
//        }
//
//        public int previousIndex()//返回列表中的前一个元素
//        {
//            return cursor - 1;
//        }
//
//        @SuppressWarnings("unchecked")
//        public E previous() //返回列表中的前一个元素
//        {
//            checkForComodification();//先判断这个元素的索引在不在集合内
//            int i = cursor - 1;
//            if (i < 0)//小于最小抛出异常
//                throw new NoSuchElementException();
//            Object[] elementData = ArrayList.this.elementData;
//            if (i >= elementData.length)//大于最大抛出异常
//                throw new ConcurrentModificationException();
//            cursor = i;
//            return (E) elementData[lastRet = i];
//        }
//
//        public void set(E e) //用指定元素替换 next 或 previous 返回的最后一个元素
//        {
//            if (lastRet < 0)
//                throw new IllegalStateException();
//            checkForComodification();
//
//            try
//            {
//                ArrayList.this.set(lastRet, e);
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }
//        public void add(E e) //将指定的元素插入列表
//        {
//            checkForComodification();//判断修改是否异常
//            try
//            {
//                int i = cursor;
//                ArrayList.this.add(i, e);
//                cursor = i + 1;
//                lastRet = -1;
//                expectedModCount = modCount;
//            }
//            catch (IndexOutOfBoundsException ex)
//            {
//                throw new ConcurrentModificationException();
//            }
//        }
//    }
//    public List<E> subList(int fromIndex, int toIndex)
//    //返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图
//    //即一个集合中间的一部分
//    {
//        subListRangeCheck(fromIndex, toIndex, size);//调用subListRangeCheck方法
//        return new SubList(this, 0, fromIndex, toIndex);//匿名建立一个SubList(this, 0, fromIndex, toIndex)的对象
//    }
//
//    static void subListRangeCheck(int fromIndex, int toIndex, int size)//用来判断索引范围是否正确
//    {
//        if (fromIndex < 0)//起始值小于0
//            throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
//        if (toIndex > size)//终点值大于集合长度
//            throw new IndexOutOfBoundsException("toIndex = " + toIndex);
//        if (fromIndex > toIndex)//起始值大于终点值
//            throw new IllegalArgumentException("fromIndex(" + fromIndex +
//                    ") > toIndex(" + toIndex + ")");
//    }
//
//    private class SubList extends AbstractList<E> implements RandomAccess
//            //第三个内部类SubList
//            //一个成员内部类继承了AbstractList，又实现了RandomAccess接口
//    {
//        private final AbstractList<E> parent;//内部类成员变量
//        private final int parentOffset;//内部类成员变量，起始位置索引
//        private final int offset;//内部类成员变量
//        int size;//内部类成员变量
//        SubList(AbstractList<E> parent,
//                int offset, int fromIndex, int toIndex)//构造方法
//        {
//            this.parent = parent;
//            this.parentOffset = fromIndex;
//            this.offset = offset + fromIndex;
//            this.size = toIndex - fromIndex;
//            this.modCount = ArrayList.this.modCount;
//        }
//        public E set(int index, E e)//指定位置替换元素
//        {
//            rangeCheck(index);//判断指定位置所以是否在集合内
//            checkForComodification();//修改检查
//            E oldValue = ArrayList.this.elementData(offset + index);//被替换的放入中间值变量
//            ArrayList.this.elementData[offset + index] = e;//替换的放入
//            return oldValue;
//        }
//
//        public E get(int index) //返回列表中指定位置的元素
//        {
//            rangeCheck(index);//判断指定位置所以是否在集合内
//            checkForComodification();//修改检查
//            return ArrayList.this.elementData(offset + index);
//        }
//
//        public int size() //集合长度
//        {
//            checkForComodification();
//            return this.size;
//        }
//
//        public void add(int index, E e) //在列表的指定位置插入指定元素
//        {
//            rangeCheckForAdd(index);//范围检查
//            checkForComodification();//修改检查
//            parent.add(parentOffset + index, e);
//            this.modCount = parent.modCount;
//            this.size++;
//        }
//
//        public E remove(int index) //移除列表中指定位置的元素
//        {
//            rangeCheck(index);//范围检查
//            checkForComodification();//修改检查
//            E result = parent.remove(parentOffset + index);
//            this.modCount = parent.modCount;
//            this.size--;
//            return result;
//        }
//
//        protected void removeRange(int fromIndex, int toIndex)
//        //此列表中移除索引在 fromIndex（包括）和 toIndex（不包括）之间的所有元素
//        {
//            checkForComodification();
//            parent.removeRange(parentOffset + fromIndex,
//                    parentOffset + toIndex);
//            this.modCount = parent.modCount;
//            this.size -= toIndex - fromIndex;
//        }
//
//        public boolean addAll(Collection<? extends E> c)
//        //将指定 collection 中的所有元素都插入到列表中
//        {
//            return addAll(this.size, c);
//        }
//
//        public boolean addAll(int index, Collection<? extends E> c)
//        //将指定 collection 中的所有元素都插入到列表中的指定位置
//        {
//            rangeCheckForAdd(index);
//            int cSize = c.size();
//            if (cSize==0)
//                return false;
//
//            checkForComodification();
//            parent.addAll(parentOffset + index, c);
//            this.modCount = parent.modCount;
//            this.size += cSize;
//            return true;
//        }
//
//        public Iterator<E> iterator()//返回以恰当顺序在此列表的元素上进行迭代的迭代器
//        {
//            return listIterator();
//        }
//
//        public ListIterator<E> listIterator(final int index)
//        //返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始
//        {
//            checkForComodification();//修改检查
//            rangeCheckForAdd(index);//范围检查
//            final int offset = this.offset;//局部成员变量
//
//            return new ListIterator<E>() {
//                int cursor = index;
//                int lastRet = -1;
//                int expectedModCount = ArrayList.this.modCount;
//
//                public boolean hasNext() {
//                    return cursor != SubList.this.size;
//                }
//
//                @SuppressWarnings("unchecked")
//                public E next() {
//                    checkForComodification();
//                    int i = cursor;
//                    if (i >= SubList.this.size)
//                        throw new NoSuchElementException();
//                    Object[] elementData = ArrayList.this.elementData;
//                    if (offset + i >= elementData.length)
//                        throw new ConcurrentModificationException();
//                    cursor = i + 1;
//                    return (E) elementData[offset + (lastRet = i)];
//                }
//
//                public boolean hasPrevious() {
//                    return cursor != 0;
//                }
//
//                @SuppressWarnings("unchecked")
//                public E previous() //返回列表中的前一个元素
//                {
//                    checkForComodification();
//                    int i = cursor - 1;
//                    if (i < 0)
//                        throw new NoSuchElementException();
//                    Object[] elementData = ArrayList.this.elementData;
//                    if (offset + i >= elementData.length)
//                        throw new ConcurrentModificationException();
//                    cursor = i;
//                    return (E) elementData[offset + (lastRet = i)];
//                }
//
//                @SuppressWarnings("unchecked")
//                public void forEachRemaining(Consumer<? super E> consumer) {
//                    Objects.requireNonNull(consumer);
//                    final int size = SubList.this.size;
//                    int i = cursor;
//                    if (i >= size) {
//                        return;
//                    }
//                    final Object[] elementData = ArrayList.this.elementData;
//                    if (offset + i >= elementData.length) {
//                        throw new ConcurrentModificationException();
//                    }
//                    while (i != size && modCount == expectedModCount) {
//                        consumer.accept((E) elementData[offset + (i++)]);
//                    }
//                    // update once at end of iteration to reduce heap write traffic
//                    lastRet = cursor = i;
//                    checkForComodification();
//                }
//
//                public int nextIndex()//返回对 next 的后续调用所返回元素的索引
//                {
//                    return cursor;
//                }
//
//                public int previousIndex()//返回对 previous 的后续调用所返回元素的索引
//                {
//                    return cursor - 1;
//                }
//
//                public void remove()//列表中移除由 next 或 previous 返回的最后一个元素
//                {
//                    if (lastRet < 0)
//                        throw new IllegalStateException();
//                    checkForComodification();
//
//                    try {
//                        SubList.this.remove(lastRet);
//                        cursor = lastRet;
//                        lastRet = -1;
//                        expectedModCount = ArrayList.this.modCount;
//                    } catch (IndexOutOfBoundsException ex) {
//                        throw new ConcurrentModificationException();
//                    }
//                }
//
//                public void set(E e) //用指定元素替换 next 或 previous 返回的最后一个元素
//                {
//                    if (lastRet < 0)
//                        throw new IllegalStateException();
//                    checkForComodification();
//
//                    try {
//                        ArrayList.this.set(offset + lastRet, e);
//                    } catch (IndexOutOfBoundsException ex) {
//                        throw new ConcurrentModificationException();
//                    }
//                }
//
//                public void add(E e) //将指定的元素插入列表
//                {
//                    checkForComodification();
//
//                    try {
//                        int i = cursor;
//                        SubList.this.add(i, e);
//                        cursor = i + 1;
//                        lastRet = -1;
//                        expectedModCount = ArrayList.this.modCount;
//                    } catch (IndexOutOfBoundsException ex) {
//                        throw new ConcurrentModificationException();
//                    }
//                }
//
//                final void checkForComodification() {
//                    if (expectedModCount != ArrayList.this.modCount)
//                        throw new ConcurrentModificationException();
//                }
//            };
//        }
//
//        public List<E> subList(int fromIndex, int toIndex) {
//            subListRangeCheck(fromIndex, toIndex, size);
//            return new SubList(this, offset, fromIndex, toIndex);
//        }
//
//        private void rangeCheck(int index)//范围检查
//        {
//            if (index < 0 || index >= this.size)
//                throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//        }
//
//        private void rangeCheckForAdd(int index) //范围检查
//        {
//            if (index < 0 || index > this.size)
//                throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//        }
//
//        private String outOfBoundsMsg(int index)
//        {
//            return "Index: "+index+", Size: "+this.size;
//        }
//
//        private void checkForComodification()//修改检查
//        {
//            if (ArrayList.this.modCount != this.modCount)
//                throw new ConcurrentModificationException();
//        }
//
//        public Spliterator<E> spliterator() {
//            checkForComodification();//修改检查
//            return new ArrayListSpliterator<E>(ArrayList.this, offset,
//                    offset + this.size, this.modCount);
//
//            //匿名创建对象
//        }
//    }
//
//    @Override
//    public void forEach(Consumer<? super E> action)
//    //不懂
//    {
//        Objects.requireNonNull(action);
//        final int expectedModCount = modCount;
//        @SuppressWarnings("unchecked")
//        final E[] elementData = (E[]) this.elementData;
//        final int size = this.size;
//        for (int i=0; modCount == expectedModCount && i < size; i++) {
//            action.accept(elementData[i]);
//        }
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//    }
//    @Override
//    public Spliterator<E> spliterator() {
//        return new ArrayListSpliterator<>(this, 0, -1, 0);
//    }
//
//    /** Index-based split-by-two, lazily initialized Spliterator */
//    static final class ArrayListSpliterator<E> implements Spliterator<E>
//            //第四个内部类ArrayListSpliterator
//            //静态内部类ArrayListSpliterator实现Spliterator接口
//    {
//        private final ArrayList<E> list;
//        private int index; //定义内部类变量，当前索引，修改/分割
//        private int fence;
//        private int expectedModCount;
//        ArrayListSpliterator(ArrayList<E> list, int origin, int fence,
//                             int //初始化)
//        //构造方法进行初始化
//        {
//            this.list = list;//初始化
//            this.index = origin;//初始化
//            this.fence = fence;//初始化
//            this.expectedModCount = expectedModCount;//初始化
//        }
//
//        private int getFence()//内部类成员方法
//        //感觉是Fence的初始化获取方法
//        {
//            int hi;//内部类成员变量
//            ArrayList<E> lst;
//            if ((hi = fence) < 0) {
//                if ((lst = list) == null)
//                    hi = fence = 0;
//                else {
//                    expectedModCount = lst.modCount;
//                    hi = fence = lst.size;
//                }
//            }
//            return hi;
//        }
//
//        public ArrayListSpliterator<E> trySplit()
//        {
//            int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
//            return (lo >= mid) ? null :
//                    new ArrayListSpliterator<E>(list, lo, index = mid,expectedModCount);
//            //条件表达式，若lo >= mid为假则创建匿名对象，为真返回null。
//        }
//
//        public boolean tryAdvance(Consumer<? super E> action)
//        {
//            if (action == null)//传入为空，抛出异常
//                throw new NullPointerException();
//            int hi = getFence(), i = index;
//            if (i < hi) {
//                index = i + 1;
//                @SuppressWarnings("unchecked") E e = (E)list.elementData[i];
//                action.accept(e);
//                if (list.modCount != expectedModCount)
//                    throw new ConcurrentModificationException();
//                return true;
//            }
//            return false;
//        }
//
//        public void forEachRemaining(Consumer<? super E> action)
//        {
//            int i, hi, mc; // hoist accesses and checks from loop
//            ArrayList<E> lst; Object[] a;
//            if (action == null)
//                throw new NullPointerException();
//            if ((lst = list) != null && (a = lst.elementData) != null) {
//                if ((hi = fence) < 0) {
//                    mc = lst.modCount;
//                    hi = lst.size;
//                }
//                else
//                    mc = expectedModCount;
//                if ((i = index) >= 0 && (index = hi) <= a.length) {
//                    for (; i < hi; ++i) {
//                        @SuppressWarnings("unchecked") E e = (E) a[i];
//                        action.accept(e);
//                    }
//                    if (lst.modCount == mc)
//                        return;
//                }
//            }
//            throw new ConcurrentModificationException();
//        }
//
//        public long estimateSize() {
//            return (long) (getFence() - index);
//        }
//
//        public int characteristics() {
//            return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
//        }
//    }
//
//    @Override
//    public boolean removeIf(Predicate<? super E> filter)//移除元素
//    {
//        Objects.requireNonNull(filter);
//        int removeCount = 0;
//        final BitSet removeSet = new BitSet(size);
//        final int expectedModCount = modCount;
//        final int size = this.size;
//        for (int i=0; modCount == expectedModCount && i < size; i++) {
//            @SuppressWarnings("unchecked")
//            final E element = (E) elementData[i];
//            if (filter.test(element)) {
//                removeSet.set(i);
//                removeCount++;
//            }
//        }
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//
//        //移除了移除元素留下的剩余元素
//        final boolean anyToRemove = removeCount > 0;
//        if (anyToRemove) {
//            final int newSize = size - removeCount;
//            for (int i=0, j=0; (i < size) && (j < newSize); i++, j++) {
//                i = removeSet.nextClearBit(i);
//                elementData[j] = elementData[i];
//            }
//            for (int k=newSize; k < size; k++) {
//                elementData[k] = null;  // Let gc do its work
//            }
//            this.size = newSize;
//            if (modCount != expectedModCount) {
//                throw new ConcurrentModificationException();
//            }
//            modCount++;
//        }
//
//        return anyToRemove;
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public void replaceAll(UnaryOperator<E> operator) {
//        Objects.requireNonNull(operator);
//        final int expectedModCount = modCount;
//        final int size = this.size;
//        for (int i=0; modCount == expectedModCount && i < size; i++) {
//            elementData[i] = operator.apply((E) elementData[i]);
//        }
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//        modCount++;
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public void sort(Comparator<? super E> c) {
//        final int expectedModCount = modCount;
//        Arrays.sort((E[]) elementData, 0, size, c);
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//        modCount++;
//    }
//}
