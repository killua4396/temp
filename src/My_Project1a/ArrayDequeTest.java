package My_Project1a;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayDequeTest {

    //判断addFirst方法是否正确
    @Test
    public void Test_addFirst(){
        ArrayDeque<Integer> i = new ArrayDeque<Integer>();
        i.addFirst(10);
        int i_actual = i.get(0);

        ArrayDeque<String> s = new ArrayDeque<String>();
        s.addFirst("Hello");
        String s_actual = s.get(0);

        Assert.assertEquals(10,i_actual);
        Assert.assertEquals("Hello",s_actual);
    }

    //判断addLast方法是否正确
    @Test
    public void Test_addLast(){
        ArrayDeque<Integer> i = new ArrayDeque<Integer>();
        i.addLast(10);
        int i_expected = i.get(i.size-1);

        ArrayDeque<String> s = new ArrayDeque<String>();
        s.addLast("Hello");
        String s_expected = s.get(i.size-1);

        Assert.assertEquals(10,i_expected);
        Assert.assertEquals("Hello",s_expected);
    }

    //测试isEmpty方法是否正确
    @Test
    public void Test_isEmpty(){
        ArrayDeque<Integer> i = new ArrayDeque<Integer>();
        boolean empty = i.isEmpty();

        ArrayDeque<Integer> i_2 = new ArrayDeque<Integer>(100);
        boolean not_empty = i_2.isEmpty();

        Assert.assertTrue(empty);
        Assert.assertFalse(not_empty);
    }

    //测试size方法是否正确
    @Test
    public void Test_size(){
        ArrayDeque<Integer> i_1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> i_2 = new ArrayDeque<Integer>(1);
        ArrayDeque<Integer> i_3 = new ArrayDeque<Integer>(1);
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
        ArrayDeque<String> s = new ArrayDeque<String>("Hello");
        s.addLast("World");
        s.addLast("Java");
        s.printDeque();//调用方法，此时本该输出到控制台上的信息输出到了outContent上
        Assert.assertEquals(outContent.toString(), "Hello World Java");

        ArrayDeque<Integer> i = new ArrayDeque<Integer>(1);
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
        ArrayDeque<Integer> i = new ArrayDeque<Integer>(50);
        i.addFirst(45);
        i.addLast(55);
        int t=i.removeFirst();
        int actual = i.get(0);
        Assert.assertEquals(actual,50);
        Assert.assertEquals(45,t);
    }

    //测试removeLast方法是否正确
    @Test
    public void Test_removeLast(){
        ArrayDeque<Integer> i = new ArrayDeque<Integer>(50);
        i.addFirst(45);
        i.addLast(55);
        int t = i.removeLast();
        int actual = i.get(i.size-1);
        Assert.assertEquals(actual,50);
        Assert.assertEquals(55,t);
    }

    //测试get方法是否正确
    @Test
    public void Test_get(){
        ArrayDeque<Integer> i = new ArrayDeque<Integer>(50);
        i.addFirst(45);
        i.addLast(55);
        i.addLast(60);
        i.addFirst(40);
        int head = i.get(0);
        int tail = i.get(i.size-1);
        int middlle = i.get(2);
        Assert.assertEquals(head,40);
        Assert.assertEquals(middlle,50);
        Assert.assertEquals(tail,60);
    }

}
