package ExceptionHandling;

public class ArithmeticExc {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            //divide(a,b);
            throw new Exception("just for fun");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("normal exception");
        }finally{
            System.out.println("always executes");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("don't divide by zero");
        return a/b;
    }
}
