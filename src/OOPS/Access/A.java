package OOPS.Access;

public class A {
    private int num = 25;
    String name;
    int[] arr;

    public int getNum() { //getter
        return num;
    }

    public void setNum(int num) { //setter for private data
        this.num = num;
    }

    public A(int[] arr, String name) {
        this.arr = new int[num];
        this.name = name;
        //this.num = num;
    }
}
