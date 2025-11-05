package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series += ch; //it is creating new object everytime and copying the old one into it
            //wastage of space
            // complexity = O(N^2);
            // this problem is solved using StringBuilder
        }
        System.out.println(series);
    }
}
