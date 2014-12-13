package com.vishal;

import javax.naming.InitialContext;

public class Test {
    public static void main(String[] args) throws Exception{
        InitialContext ic = new InitialContext();
        Integer mySpecialValue = (Integer)ic.lookup("java:comp/env/mySpecialValue");
    }
}
