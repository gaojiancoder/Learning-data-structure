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
    //向所有元素后添加一个新元素
    public void addLast(int e){
        data[size]=e;
        size ++;

    }
    public void addFirst(int e){
        add(0,e);
    }
    public void add(int index,int e) {
        if (size == data.length)
            throw new IllegalArgumentException("数组容量已满");

        if (index<0|| index >size)
            throw new IllegalArgumentException("越界");
        for (int i =size -1;i>=index;i--)
            data[i+1] =data[i];

        data[index] =e;
        size ++;
    }
}
