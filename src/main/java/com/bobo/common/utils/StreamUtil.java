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
 * @Description: 流处理工具类
 * @author: charles
 * @date: 2019年12月6日 上午10:47:50
 */
public class StreamUtil {
	/**
	 * 
	 * @Title: read
	 * @Description: 一行行读取文件并放入list集合中
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
