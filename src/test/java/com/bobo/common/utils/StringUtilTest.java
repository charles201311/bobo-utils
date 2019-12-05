package com.bobo.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	

	@Test
	public   void  testEmail() {
		boolean b = StringUtil.isEmail("_34444444@qq.net");
		System.out.println(b);
	}

	
	@Test
	public   void  testPhone() {
		boolean b = StringUtil.isPhoneNumber(null);
		System.out.println(b);
	}
	
	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(null);
		System.out.println(b);
		boolean b2 = StringUtil.hasLength("");
		System.out.println(b2);
		boolean b3 = StringUtil.hasLength(" ");
		System.out.println(b3);
	}

	@Test
	public void testHasText() {
		
		boolean b = StringUtil.hasText(null);
		System.out.println(b);
		boolean b2 = StringUtil.hasText("");
		System.out.println(b2);
		boolean b3 = StringUtil.hasText(" ");
		System.out.println(b3);
	}

	@Test
	public void testRandomChineseString() {
		for (int i =0 ;i<10;i++) {
			String string = StringUtil.randomChineseString();
			System.out.print(string+"  ");
		}
		
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}

}
