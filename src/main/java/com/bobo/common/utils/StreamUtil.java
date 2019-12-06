package com.bobo.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: ����������
 * @author: charles
 * @date: 2019��12��6�� ����10:47:50
 */
public class StreamUtil {
	/**
	 * 
	 * @Title: read
	 * @Description: һ���ж�ȡ�ļ�������list������
	 * @param inputStream
	 * @return
	 * @return: List<String>
	 * @throws IOException 
	 */
	public static List<String> read(InputStream inputStream) throws IOException{
		
		BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
		List<String> list = new ArrayList<String>();
		String str="";
		while((str=read.readLine())!=null) {
			list.add(str);
		}
		return list;
	}
	
	
	

}
