package List;
//将裸露的IntNode包装好！
public class SLList<Blorp> implements List61B<Blorp>{
    public class Node{
        public Blorp item;
        public Node next;

        public Node(Blorp i,Node h){
            item = i;
            next = h;
        }
    }

    private Node sentinel;
    private int size;
    public SLList(){
        size = 0;
        sentinel = new Node(null,null);
    }

    public SLList(Blorp x){
        size = 1;
        sentinel = new Node(null,null);
        sentinel.next = new Node(x,null);
    }

    public void addFirst(Blorp x){
        Node oldFrontNode = sentinel.next;
        Node newNode = new Node(x,oldFrontNode);
        sentinel.next = newNode;
        size+=1;
    }

    public Blorp getFirst(){
        return  sentinel.next.item;
    }

    public void addLast(Blorp x){
        size +=1;
        Node p = sentinel;
        while(p.next!=null){
            p=p.next;
        }
        p.next = new Node(x,null);
    }

    private Node getLastNode(){
        Node p = sentinel;
        while(p.next!=null){
            p=p.next;
        }
        return p;
    }

    public Blorp getLast(){
        Node back = getLastNode();
        return back.item;
    }

    public Blorp removeLast(){
        Node back = getLastNode();
        if(back==sentinel){
            return null;
        }
        size--;
        Node p = sentinel;
        while(p.next!=back){
            p=p.next;
        }
        p.next = null;
        return back.item;
    }

    public int size(){
        return size;
    }

    public Blorp get(int position){
        if (position==0){
            return getFirst();
        }
        Node currentNode = sentinel.next.next;
        while(position>1&&currentNode.next!=null){
            position = -1;
            currentNode = currentNode.next;
        }
        return currentNode.item;
    }

    public void insert(Blorp item,int position){
        if(sentinel.next==null||position==0){
            addFirst(item);
            return;
        }
        Node currnetNode = sentinel.next.next;
        while(position>1&&currnetNode.next!=null){
            position -=1;
            currnetNode = currnetNode.next;
        }
        Node newNode = new Node(item,currnetNode.next);
        currnetNode.next = newNode;
    }
}
