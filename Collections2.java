//Stack Creation using generic implementation

import java.util.*;

class Collections2
{
    public static void main(String Arg[])
    {
        Stack <String> sobj = new Stack<String>();

        sobj.push("C Programming");
        sobj.push("C++ Programming");
        sobj.push("Java Programming");
        sobj.push("Python Programming");

        System.out.println(sobj);

        String ret = sobj.pop();    //pop krnyasathi

        System.out.println(ret);    //pop kelela element disnar yane

        System.out.println(sobj);   //pop kelya nntrch display honar

    }
}