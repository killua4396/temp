package My_Project1a;

public class LinkedListDeque<T> {
    //定义链表的一个节点
    public class DequeNode{
        public DequeNode prior;
        public T data;
        public DequeNode next;
        public DequeNode(DequeNode p,T d,DequeNode n){
            this.prior = p;
            this.data = d;
            this.next = n;
        }
        public DequeNode(DequeNode p,DequeNode n){
            this.prior = p;
            this.next = n;
        }
    }

    //定义size，头结点和尾结点
    private int size;
    public DequeNode head;
    public DequeNode tail;

    //无参构造方法
    public LinkedListDeque(){
        size = 0;
        head = new DequeNode(null,null);
        tail = new DequeNode(null,null);
        head.prior = tail;
        head.next = tail;
        tail.next = head;
        tail.prior = head;
    }

    //带参数的构造方法
    public LinkedListDeque(T data){
        size = 1;
        head = new DequeNode(null,null);
        tail = new DequeNode(null,null);
        head.prior = tail;
        tail.next = head;
        DequeNode d = new DequeNode(head,data,tail);
        head.next = d;
        tail.prior = d;
    }

    //在链表的头部加入元素
    public void addFirst(T item){
        DequeNode d = new DequeNode(head,item,head.next);
        head.next.prior = d;
        head.next = d;
        size++;
    }

    //在链表的尾部加入元素
    public void addLast(T item){
        DequeNode d = new DequeNode(tail.prior,item,tail);
        tail.prior.next =d;
        tail.prior =d;
        size++;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        if(size == 0){
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
        DequeNode d = new DequeNode(null, (T) "",head.next);
        while(d.next!=tail.prior){
//            output += (String) d.next.data +" ";
            System.out.print(d.next.data+" ");
            d = d.next;
        }
//        output += (String) tail.prior.data;
        System.out.print(tail.prior.data);
    }

    //删除第一个元素，并返回第一个元素的值
    public T removeFirst(){
        T t = head.next.data;
        head.next = head.next.next;

        head.next.prior.next=null;
        head.next.prior.prior=null;
        head.next.prior.data=null;

        size--;
        head.next.prior = head;
        return t;
    }

    //删除最后一个元素，并返回最后一个值
    public T removeLast(){
        T t =tail.prior.data;
        tail.prior = tail.prior.prior;

        tail.prior.next.next=null;
        tail.prior.next.prior=null;
        tail.prior.next.data=null;

        size--;
        tail.prior.next = tail;
        return t;
    }

    //返回第i个元素的值
    public T get(int index){
        int judge = size/2;
        if(index<judge){//从头结点开始
            int count = 0;
            DequeNode d = new DequeNode(null,head.next);
            while(count<index){
                d = d.next;
                count++;
            }
            return d.data;
        }
        else {//从尾结点开始
            int count = size-1;
            DequeNode d = new DequeNode(tail.prior,null);
            while(count>index){
                d = d.prior;
                count--;
            }
            return d.data;
        }
    }
}
