package List;


public class Intlist {
    //值
    public int first;
    //下一个值的地址
    public Intlist rest;
    //构造函数
    public Intlist(int f , Intlist r){
        first = f;
        rest = r;
    }
    //返回链表元素个数,使用递归
    public int size(){
        if(this.rest==null){
            return 1;
        }
        return 1+this.rest.size();
    }
    //返回链表元素个数，使用迭代
    public int interativeSize(){
        int count=0;
        Intlist p = this;
        while(p!=null){
            count++;
            p=p.rest;
        }
        return count;
    }
    //获得指定位置元素值(运用递归)
    public int get(int position){
        if(position == 0){
            return first;
        }
        return rest.get(position-1);
    }



    public static void main(String[] args) {
        Intlist L = new Intlist(5,null);
        L = new Intlist(10,L);
        L = new Intlist(15,L);
        L = new Intlist(20,L);
        L = new Intlist(25,L);
        System.out.println(L.get(3));
    }
}
