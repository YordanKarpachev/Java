package GenericsLAB.A01;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar <T>{

private Deque<T> elements;

    public Jar (){

        elements = new ArrayDeque<>();
    }

    public void add(T element){
        elements.add(element);
    }

    public T remove(){
      return this.elements.pop();
    }

}
