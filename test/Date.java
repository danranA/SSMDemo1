import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import org.apache.ibatis.ognl.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
class Date1{
    public static void main(String[] args) {
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
//        String str = "2016/1/5 12:12:12";
//        try {
//            java.util.Date d = sdf.parse(str);
//            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
//        } catch (java.text.ParseException e) {
//            e.printStackTrace();
//        }


        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        java.util.Date d= new java.util.Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        java.util.Date d1= new java.util.Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);
    }

}
