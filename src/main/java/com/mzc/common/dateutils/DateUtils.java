/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: DateUtils.java 
 * @Prject: mazhicheng-common
 * @Package: com.mzc.common.dateutils 
 * @Description: TODO
 * @author: 马志成  
 * @date: 2019年10月11日 下午1:16:58 
 * @version: V1.0   
 */
package com.mzc.common.dateutils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtils 
 * @Description: 日期工具类
 * @author:马志成 
 * @date: 2019年10月11日 下午1:16:58  
 */
public class DateUtils {
			
	
	//输入日期把日期变成输入月份第一天
	public static Date getMinDate(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		return cal.getTime();
	}
	//输入日期把日期变成输入月份最后一天 最后一秒
	public static Date getMaxDate(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, 1);
		Date minDate = DateUtils.getMinDate(cal.getTime());
		cal.setTime(minDate);
		cal.add(Calendar.SECOND, -1);
		
		return cal.getTime();
	}
}
