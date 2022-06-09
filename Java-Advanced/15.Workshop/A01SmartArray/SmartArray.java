package WorkShopLAB;

import java.util.function.Consumer;

public class SmartArray {
    private Integer[] arr;
    private int size = 0;

    public SmartArray() {


        arr = new Integer[4];
    }

    public void add(int number) {
        if (size == arr.length) {


            arr = grow();
        }
        arr[size] = number;
        size++;
    }

    private Integer[] grow() {
        Integer[] newarr = new Integer[arr.length * 2];
        System.arraycopy(arr, 0, newarr, 0, arr.length);
        return newarr;
    }

    public int get(int index) {
        validationIndex(index);
        return arr[index];

    }

    private void validationIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("invalid index " + index);
        }
    }

    public int size() {
        return this.size;
    }

    public int remove(int index) {
        validationIndex(index);

        size--;
        int number = arr[index];


        if (size - index >= 0) System.arraycopy(arr, index + 1, arr, index, size - index);
        arr[size] = null;


        return number;
    }

    public boolean contains (int element){
        for (int i = 0; i < size; i++) {
            if(arr[i] == element){
                return true;
            }
        }
        return false;
    }

    public void add(int index, int element){
        validationIndex(index);
        int lastElement = arr[size- 1];


        if (size - 1 - index >= 0) System.arraycopy(arr, index, arr, index + 1, size - 1 - index);
        arr[index] = element;
        add(lastElement);

        if(arr.length / 2 >= size){
           kurzen();
        }
    }

    private void kurzen() {
        Integer[] newarr = new Integer[arr.length / 2];
        System.arraycopy(arr, 0, newarr, 0, arr.length);
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < this.size; i++) {

            consumer.accept(arr[i]);
        }
    }
}
