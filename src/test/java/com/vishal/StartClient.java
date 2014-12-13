package com.vishal;

import com.google.gwt.dev.DevMode;

public class StartClient {
    public static void main(String[] args) throws Exception{
        DevMode.main(new String[]{"-nosuperDevMode","-war", "src/main/webapp", "-startupUrl","Hello.html","com.vishal.gwt.gwtTest.Hello"});
    }
}
