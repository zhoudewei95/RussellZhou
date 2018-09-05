package charpter5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
    public static boolean isPhoneNumber(String strPhone){
        String regex = "^((13[0-9])|(15[^4,\\D])|(18[0-9])|(17[0-9])|(14[0-9]))\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(strPhone);
        return m.find();
    }

    public static void main(String[] args){
        String strPhone = "13681692838";
        if(test3.isPhoneNumber(strPhone) == true){
            System.out.println("该号码是手机号");
        }else{
            System.out.println("该号码不是手机号");
        }
    }

}
