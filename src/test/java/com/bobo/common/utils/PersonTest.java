package com.bobo.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		for (int i = 0; i <10000; i++) {
			
		
		Person person = new Person();
		//��������ֵ����StringUtil.generateChineseName()������4�֣�
		person.setName(StringUtil.generateChineseName());
		//��������ֵ����RandomUtil.random()������������1-120��֮�䣨4�֣�
		person.setAge(RandomUtil.random(1, 120));
		//��������ֵ����StringUtil.randomChineseString()����������Ϊ140��������֣�4�֣�
		person.setAbout(StringUtil.randomChineseString(140));
		//ע����������ֵģ��2010��1��1�������������ʱ�䣨4�֣���
		
		Calendar c = Calendar.getInstance();//������
		//��2010��1��1�� ��ʼ��������
		c.set(2010, 0, 1);
		
		person.setCreated(DateUtil.random(c.getTime(), new Date()));
		System.out.println(person);
		}
		
	}

}
