package T11Polymorphism.A01;

public class MathOperation {
    public int add(int n , int n1){
        return  n + n1;
    }

    public int add(int n1, int n2, int n3){
       return add(n1 , n2) + n2;
    }

    public int add(int n, int n1, int n2, int n3){
        return add(n1, n2, n) + n3;

    }
}
