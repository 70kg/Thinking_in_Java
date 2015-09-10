package the_thirteenth;
/**
 * 第十三章  字符串
 * @author Mr_Wrong
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.printf("%s <--字符串\n","我");
		
		String s = "";
		s=String.format("%-10.2f %-5s", 1.2334,"后面的");
		
		System.out.println(s);
	}
}
