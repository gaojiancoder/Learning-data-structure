public class Array {
    private int[] data;
    private int size;
    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data =new int[capacity];
        size =0;
    }
    //无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }
    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;
    }
}
