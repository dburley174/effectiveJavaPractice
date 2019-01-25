package chapter2.item3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @date 2019年1月25日 下午6:39:37
 * @author 50689
**/
public enum Dates {
	INSTANCE;
	
	public static final String DATE_FORMAT_NORMAL = "yyyy-MM-dd HH:mm:ss";
	
	private SimpleDateFormat sdf = new SimpleDateFormat();
	
	public static String format(Date date) {
//		sdf.
		return null;
	}
}
