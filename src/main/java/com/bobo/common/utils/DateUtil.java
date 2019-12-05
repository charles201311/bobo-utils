package com.bobo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil
 * @Description: ���ڹ����� * @author: charles
 * @date: 2019��12��5�� ����3:01:03
 */
public class DateUtil {
	
	//����һ�����³�ʱ��
	
	
	
	
	// ���ظ�ĳһ��ʱ��ε��������

	public static Date random(Date minDate, Date maxDate) {
		// ��ʼ������
		long t1 = minDate.getTime();
		// ����������
		long t2 = maxDate.getTime();
        //����t2 t1֮��ĺ�����
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
