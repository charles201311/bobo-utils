package com.bobo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil
 * @Description: 日期工具类 * @author: charles
 * @date: 2019年12月5日 下午3:01:03
 */
public class DateUtil {
	
	/**
	 * 
	 * @Title: getMonthEnd 
	 * @Description: 返回指定月份的月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthEnd(Date date) {
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//让当前月份+1
		c.add(Calendar.MONTH, 1);
		//让日期变成下个月月初
		
		Date init = getMonthInit(c.getTime());
		
		//用月初再次初始日历类
		c.setTime(init);
		//日期的秒数-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
		
		
	}
	
	
	/**
	 * 
	 * @Title: getMonthInit 
	 * @Description: //返回 指定月份月初时间
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthInit(Date date) {
		//获取的当前系统的时间的日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//设置月份的天为 1
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	
	
	
	
	
	// 返回个某一个时间段的随机日期

	public static Date random(Date minDate, Date maxDate) {
		// 开始毫秒数
		long t1 = minDate.getTime();
		// 结束毫秒数
		long t2 = maxDate.getTime();
        //介于t2 t1之间的毫米数
		long t3 = (long) (Math.random() * (t2 - t1 + 1) + t1);

		return new Date(t3);

	}

	public static void main(String[] args) {
		for (int i = 0;i<100;i++) {
		Date date = DateUtil.random(new Date(900000000), new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	}
}
