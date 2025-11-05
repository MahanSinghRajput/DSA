package ExceptionHandling;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try{
            String name = "abc";
            if(name.equals("abc")) throw new MyException("worked");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
