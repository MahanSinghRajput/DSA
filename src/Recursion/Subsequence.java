package Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        //subSeq("","abc");
        System.out.println(subSeq2ASCII("","abc"));
    }
    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }

    static ArrayList<String> subSeq2(String p, String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            char ch = up.charAt(0);

            ArrayList<String> left = subSeq2(p+ch,up.substring(1));
            ArrayList<String> right = subSeq2(p,up.substring(1));
            left.addAll(right);
            return left;
    }

    static void subSeqASCII(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeqASCII(p+ch,up.substring(1));
        subSeqASCII(p,up.substring(1));
        subSeqASCII(p + (ch+0),up.substring(1));
    }

    static ArrayList<String> subSeq2ASCII(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeq2ASCII(p+ch,up.substring(1));
        ArrayList<String> second = subSeq2ASCII(p,up.substring(1));
        ArrayList<String> third = subSeq2ASCII(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
