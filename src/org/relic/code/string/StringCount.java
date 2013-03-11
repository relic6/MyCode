package org.relic.code.string;

/**
 * TODO
 * 
 * @author relic
 * @version $Id$
 * @createtime 2013-3-11下午09:22:48
 */
public class StringCount {
	public static void main(String[] args) {
		String s1 = "acdesfafafdsfdafera";
		String s2 = "af";
		String result = getstr(s1, s2);
		int count = 0;
		while (!result.equals("#")) {
			count++;
			result = getstr(result, s2);
		}
		System.out.println(count);
	}

	public static String getstr(String s1, String s2) {
		int i = s1.indexOf(s2);
		int i2 = s2.length();
		if (i != -1) {
			return s1.substring(i + i2);
		} else {
			return "#";
		}
	}
}
