package com.bobo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil
 * @Description: 日期工具类 * @author: charles
 * @date: 2019年12月5日 下午3:01:03
 */
public class DateUtil {
	
	//返回一个月月初时间
	
	
	
	
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
