package com.appleframework.pay.trade.utils.alipay.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @功能说明:
 * @创建者: Peter
 * @创建时间: 16/6/14  下午3:43
 * @公司名称:深圳市果苹网络科技有限公司(http://www.appleframework.com)
 * @版本:V1.0
 */
public class AliPayUtil {
	
	// private static final Logger logger = LoggerFactory.getLogger(AliPayUtil.class);
    
    //private static final String UTF8 = "UTF-8";

    public static Map<String , String> parseNotifyMsg(Map<String, String[]> requestParams){

        Map<String,String> params = new HashMap<String,String>();

        for (Iterator<?> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }

        return params;
    }
    

}
