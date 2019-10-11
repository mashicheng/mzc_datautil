/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: DateUtilsTest.java 
 * @Prject: mazhicheng-common
 * @Package: com.mzc.common.dateutils 
 * @Description: TODO
 * @author: 马志成  
 * @date: 2019年10月11日 下午1:35:12 
 * @version: V1.0   
 */
package com.mzc.common.dateutils;



import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.StyleContext.SmallAttributeSet;

import org.junit.Test;

/** 
 * @ClassName: DateUtilsTest 
 * @Description: TODO
 * @author:马志成 
 * @date: 2019年10月11日 下午1:35:12  
 */
public class DateUtilsTest {

	/**
	 * Test method for {@link com.mzc.common.dateutils.DateUtils#getSimDate(java.util.Date)}.
	 */
	@Test
	public void testGetSimDate() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 11, 10, 13, 15, 16);
		Date simDate = DateUtils.getMinDate(cal.getTime());
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sim.format(simDate));
	}
	
	@Test
	public void testGetMaxDate() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 1, 16, 24, 32, 56);
		
		Date maxDate = DateUtils.getMaxDate(cal.getTime());
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sim.format(maxDate));
	}

}
