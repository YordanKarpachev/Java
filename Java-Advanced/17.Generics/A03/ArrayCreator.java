package GenericsLAB.A02;

import java.lang.reflect.Array;

public class ArrayCreator  {



    public static <T> T[] create(int length, T element){
          T[] arr = (T[]) new Object[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = element;
        }
        return arr;
    }



    public static <T> T[] create (Class<T> cl, int length, T element){
        T[] arr = (T[]) Array.newInstance(cl, length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = element;
        }
        return arr;
    }
}
