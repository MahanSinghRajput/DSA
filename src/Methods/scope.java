package Methods;

public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            // int a=56; //this would give an error
            a=56; //you cannot initialise 'a' again in this block
            int c=30; //this 'c' cant be used outside this block
        }
        /*
            anything that is initialised in this block cannot be used outside
            the block whereas anything initialised outside can be modified or
            changed inside this block.
         */

        //System.out.println(c); //this would give error
        System.out.println(a); //the value will change for 'a'

        int c=90; // c can be initialised outside again
        System.out.println(c);
    }
}
