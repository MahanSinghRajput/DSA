package OOPS.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age,String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

    public Human(Human other) {
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //this is shallow copy
        return super.clone();
    }
}
