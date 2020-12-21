package List;
public class Sort {
    //交换元素方法
    public static void sort(String[] x){
        sort(x,0);
    }
    //交换方法帮助方法
    public static void sort(String[] x,int start){
        if(start == x.length){
            return;
        }
        int smallestIndex = findSmallest(x,start);
        swap(x,start,smallestIndex);
        sort(x,start+1);
    }

    //找到最小值
    public static int findSmallest(String[] x,int start){
        int SmallestIndex = start;
        for(int i=start;i< x.length;i++){
            int judge = x[i].compareTo(x[SmallestIndex]);
            if(judge < 0){
                SmallestIndex = i;
            }
        }
        return SmallestIndex;
    }

    //交换a，b元素的位置
    public static void swap(String[] x,int a,int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
