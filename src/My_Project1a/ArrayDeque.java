package My_Project1a;
//未完成......................................
public class ArrayDeque<T> {
    public T[] items;
    public int size;

    //构造方法
    public ArrayDeque(){
        size = 0;
        items = (T[]) new Object[100];
    }
    public ArrayDeque(T data){
        size = 1;
        items = (T[]) new Object[100];
        items[0] = data;
    }

    //改变数组大小
    private void resize(int capacity){
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }

    //在链表的头部加入元素
    public void addFirst(T item){
        if(size == items.length){
            resize(size*2);
        }
        for(int i=size;i>0;i--){
            items[i] = items[i-1];
        }
        items[0] = item;
        size++;
    }

    //在链表的尾部加入元素
    public void addLast(T item){
        if(size == items.length){
            resize(size*2);
        }
        items[size] = item;
        size++;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }

    //返回链表大小
    public int size(){
        return size;
    }

    //打印链表
    public void printDeque(){
        for(int i=0;i<size-1;i++){
            System.out.print(items[i]+" ");
        }
        System.out.print(items[size-1]);
    }

    //删除第一个元素，并返回第一个元素的值
    public T removeFirst(){
        T t = items[0];
        for(int i=0;i<size;i++){
            items[i] = items[i+1];
        }
        size--;
        return t;
    }

    //删除最后一个元素，并返回最后一个值
    public T removeLast(){
        T t = items[size-1];
        items[size-1] = null;
        size--;
        return t;
    }

    //返回第i个元素的值
    public T get(int index){
        return items[index];
    }
}
