package List;

public class AList<T> implements List61B<T> {
    //参数
    private T[] items;
    private int size;

    //构造方法
    public AList(){
        items =(T[]) new Object[100];
        size = 0;
    }

    //改变数组大小
    private void resize(int capacity){
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }

    //将元素插入到最后
    @Override
    public void addLast(T x){
        if(size == items.length){
            resize(size*2);
        }

        items[size] = x;
        size++;
    }

    //获取最后一个元素
    @Override
    public T getLast(){
        return items[size-1];
    }

    //获取第i个元素
    @Override
    public T get(int i){
        return items[i];
    }

    //获取链表的大小
    @Override
    public int size(){
        return size;
    }

    //删除最后的元素，并且返回删除的元素
    @Override
    public T removeLast(){
        T temp = this.getLast();
        items[size -1] = null;
        size--;
        return temp;
    }

    //插入元素
    @Override
    public void insert(T x,int position){
        T[] newItems = (T[]) new Object[items.length+1];
        System.arraycopy(items,0,newItems,0,position);
        newItems[position] = x;
        System.arraycopy(items,position,newItems,position+1,items.length-position);
        items = newItems;
    }

    //添加头元素
    @Override
    public void addFirst(T x){
        insert(x,0);
    }

    //获取头元素
    @Override
    public T getFirst(){
        return get(0);
    }

}

