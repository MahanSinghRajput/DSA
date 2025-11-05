package Methods;

public class shadowing {
    static int x=10; //this can be used in the shadowing block (refer to scope same as that)
                     //this will be shadowed at line no. 11
    public static void main(String[] args) {
        int a=1;
        num(a);
        System.out.println(x);
        int x=5;
        System.out.println(x);  //the value of x in this block would be shown the value of
                                // the higher block would be hidden.
    }
    static void num(int a){
        x=20;
    }
}
