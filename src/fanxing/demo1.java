package fanxing;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        Class classOfStringList = stringList.getClass();
        Class classOfIntegerList = integerList.getClass();
        if(classOfIntegerList.equals(classOfStringList)) {
            System.out.println(classOfIntegerList +","+ classOfStringList);
            System.out.println("类型相同");
        }
    }
}
