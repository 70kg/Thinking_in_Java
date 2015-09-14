package the_thirteenth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 第十三章  字符串
 * @author Mr_Wrong
 *
 */
public class Main {
	
	@Override
	public String toString() {
		return "InfiniteRecursion address :"+super.toString();
	}
	public static void main(String[] args) {
		System.out.printf("%s <--字符串\n","我");
		
		String s = "";
		s=String.format("%-10.2f %-5s", 1.2334,"后面的");
		System.out.println(s);
		
		//正则表达式
		
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		
		while (m.find()) {
			System.out.print(m.group()+" ");
		}
		System.out.println(" ");
		int i = 0;
		while (m.find(i)) {
			System.out.print(m.group()+" ");
			i++;
		}
		
		System.out.println(new Main());
	}
}
