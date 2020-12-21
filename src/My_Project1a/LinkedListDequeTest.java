package My_Project1a;

import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LinkedListDequeTest {
    //判断addFirst方法是否正确
    @Test
    public void Test_addFirst(){
        LinkedListDeque<Integer> i = new LinkedListDeque<Integer>();
        i.addFirst(10);
        int i_expected = i.head.next.data;

        LinkedListDeque<String> s = new LinkedListDeque<String>();
        s.addFirst("Hello");
        String s_expected = s.head.next.data;

        Assert.assertEquals(10,i_expected);
        Assert.assertEquals("Hello",s_expected);
    }

    //判断addLast方法是否正确
    @Test
    public void Test_addLast(){
        LinkedListDeque<Integer> i = new LinkedListDeque<Integer>();
        i.addLast(10);
        int i_expected = i.tail.prior.data;

        LinkedListDeque<String> s = new LinkedListDeque<String>();
        s.addLast("Hello");
        String s_expected = s.tail.prior.data;

        Assert.assertEquals(10,i_expected);
        Assert.assertEquals("Hello",s_expected);
    }

    //测试isEmpty方法是否正确
    @Test
    public void Test_isEmpty(){
        LinkedListDeque<Integer> i = new LinkedListDeque<Integer>();
        boolean empty = i.isEmpty();

        LinkedListDeque<Integer> i_2 = new LinkedListDeque<Integer>(100);
        boolean not_empty = i_2.isEmpty();


        Assert.assertTrue(empty);
        Assert.assertFalse(not_empty);
    }

    //测试size方法是否正确
    @Test
    public void Test_size(){
        LinkedListDeque<Integer> i_1 = new LinkedListDeque<Integer>();
        LinkedListDeque<Integer> i_2 = new LinkedListDeque<Integer>(1);
        LinkedListDeque<Integer> i_3 = new LinkedListDeque<Integer>(1);
        i_2.addLast(1);
        i_3.addFirst(1);
        i_3.addLast(1);
        int size_1 = i_1.size();
        int size_2 = i_2.size();
        int size_3 = i_3.size();
        Assert.assertEquals(0,size_1);
        Assert.assertEquals(2,size_2);
        Assert.assertEquals(3,size_3);
    }

    //测试printDeque方法是否正确
    @Test
    public void Test_printDeque(){
        //将System.output的输出流接到outContent上
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //定义链表
        LinkedListDeque<String> s = new LinkedListDeque<String>("Hello");
        s.addLast("World");
        s.addLast("Java");
        s.printDeque();//调用方法，此时本该输出到控制台上的信息输出到了outContent上
        Assert.assertEquals(outContent.toString(), "Hello World Java");

        LinkedListDeque<Integer> i = new LinkedListDeque<Integer>(1);
        i.addLast(2);
        i.addLast(3);
        i.addLast(4);
        i.addLast(5);
        i.addLast(6);
        i.addLast(7);
        i.printDeque();
        Assert.assertEquals(outContent.toString(), "Hello World Java1 2 3 4 5 6 7");
    }

    //测试removeFirst方法是否正确
    @Test
    public void Test_removeFirst(){
        LinkedListDeque<Integer> i = new LinkedListDeque<Integer>(50);
        i.addFirst(45);
        i.addLast(55);
        int t=i.removeFirst();
        int actual = i.head.next.data;
        Assert.assertEquals(actual,50);
        Assert.assertEquals(45,t);
    }

    //测试removeLast方法是否正确
    @Test
    public void Test_removeLast(){
        LinkedListDeque<Integer> i = new LinkedListDeque<Integer>(50);
        i.addFirst(45);
        i.addLast(55);
        int t = i.removeLast();
        int actual = i.tail.prior.data;
        Assert.assertEquals(actual,50);
        Assert.assertEquals(55,t);
    }

    //测试get方法是否正确
    @Test
    public void Test_get(){
        LinkedListDeque<Integer> i = new LinkedListDeque<Integer>(50);
        i.addFirst(45);
        i.addLast(55);
        i.addLast(60);
        i.addFirst(40);
        int head = i.head.next.data;
        int tail = i.tail.prior.data;
        int middlle = i.head.next.next.next.data;
        Assert.assertEquals(head,40);
        Assert.assertEquals(middlle,50);
        Assert.assertEquals(tail,60);
    }
}

