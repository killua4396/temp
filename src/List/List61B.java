package List;

public interface List61B<T>{

    //将元素插入到最后
    public void addLast(T x);

    //获取最后一个元素
    public T getLast();

    //获取第i个元素
    public T get(int i);

    //获取链表的大小
    public int size();

    //删除最后的元素，并且返回删除的元素
    public T removeLast();

    //插入元素
    public void insert(T x,int position);

    //添加头元素
    public void addFirst(T x);

    //获取头元素
    public T getFirst();

    //默认方法
    default public void print(){
        for(int i =0;i<size();i++){
            System.out.print(get(i)+" ");
        }
        System.out.println();
    }

}
