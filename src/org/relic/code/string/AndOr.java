package org.relic.code.string;

import java.util.ArrayList;
import java.util.List;


 /**
 * TODO 字符串进行交集和并集操作
 * @author relic
 * @version $Id$
 * @createtime 2013-4-22下午09:40:33
 */
public class AndOr {
	public static void main(String[] args) {
		String a="-add-,-edit-,-list-";
		String b="-add-,-del-";
		System.out.println(orString(a,b,","));
		System.out.println(orString2(a,b,","));
		System.out.println(andString(a,b,","));
		System.out.println(andString2(a,b,","));
	}
	/**
	 * 使用字符的indexOf操作
	 * @param str1
	 * @param str2
	 * @param splitString
	 * @return
	 */
	public static String andString(String str1,String str2,String splitString){
		StringBuffer result=new StringBuffer();
		for(String s2:str2.split(splitString)){
			if(str1.indexOf(s2)!=-1){
				result.append(s2+",");
			}
		}
		return result.toString();
	}
	/**
	 * 将源值先存入list中，这种方式适应操作更强
	 * @param str1
	 * @param str2
	 * @param splitString
	 * @return
	 */
	public static String andString2(String str1,String str2,String splitString){
		StringBuffer result=new StringBuffer();
		List<String> list1=new ArrayList<String>();
		
		for(String s1:str1.split(splitString)){
			list1.add(s1);
		}
		
		for(String s2:str2.split(splitString)){
//			if(!list1.contains(s2)){
//				result.append(","+s2);
//			}
			if(list1.indexOf(s2)!=-1){
				result.append(s2+",");
			}
		}
		return result.toString();
	}
	
	
	public static String orString(String str1,String str2,String splitString){
		StringBuffer result=new StringBuffer();
		result.append(str1);
		for(String s2:str2.split(splitString)){
			if(str1.indexOf(s2)==-1){
				result.append(","+s2);
			}
		}
		return result.toString();
	}
	
	public static String orString2(String str1,String str2,String splitString){
		List<String> list1=new ArrayList<String>();
		
		for(String s1:str1.split(splitString)){
			list1.add(s1);
		}
		
		StringBuffer result=new StringBuffer();
		result.append(str1);
		for(String s2:str2.split(splitString)){
//			if(!list1.contains(s2)){
//				result.append(","+s2);
//			}
			if(list1.indexOf(s2)==-1){
				result.append(","+s2);
			}
		}
		return result.toString();
	}
	
}


