package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by  on 2021/8/25.
 */
public class Test {

    public static void main(String[] args) {

        String s = "03-25 01:00:06.896  root     0     0 W healthd : battery l=44 v=7644 t=45.1 h=2 st=3 c=-876 fc=4310000 cc=84 ct=1738000 tl=0 ct=Unknown chg=";
        //String r = "^.*?(?=r)|(?<=l=).*?(?=\\sv)|(?<=t=).*?(?=\\sh)";
        String r = "^.*?(?=r)|(?<=l=)\\d*(?=\\sv)|(?<=t=).*?(?=\\sh)";
        Pattern pattern = Pattern.compile(r);
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }

    }

}
