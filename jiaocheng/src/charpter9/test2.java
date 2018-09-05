package charpter9;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class test2 {
    public double getCircleArea(double radius){
        double area = PI * radius * radius;
        return area;
    }
    /*数字格式化*/
    public static void SimgleFormat(String pattern,double value){
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(output);
    }

    public static void main(String[] args){
        test2 t = new test2();
        double circleArea = t.getCircleArea(6.643);
        SimgleFormat("#.#####",circleArea);
    }


}
