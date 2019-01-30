package autoTest;

import java.text.SimpleDateFormat;
import java.util.*;

public class commonly {
    /**  
          * 获取现在时间  
          *  
          * @return返回字符串格式 yyyy-MM-dd HH:mm:ss  
          */
    public static String getStringDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(new Date());
        return dateString;
        }
            /**  
          * 获取现在时间  
          * @return返回字符串格式 yyyyMMddHHmmss  
          */
    public static String getStringAllDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String dateString = formatter.format(new Date());
        return dateString;
        }
}
