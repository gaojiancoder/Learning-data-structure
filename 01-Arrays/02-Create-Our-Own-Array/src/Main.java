public class Main {

    public static void main(String[] args) {
        Array array =new Array(){};

        int capacity = array.getCapacity();
        int size = array.getSize();
        boolean empty = array.isEmpty();
        System.out.println(capacity);
        System.out.println(size);
        System.out.println(empty);
    }
}
