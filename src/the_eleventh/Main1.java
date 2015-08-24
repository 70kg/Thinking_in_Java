package the_eleventh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 迭代器
 * @author Mr_Wrong
 *
 */
public class Main1 {
	public static void main(String[] args) {
		
		
		List<String> strings = Arrays.asList("hah","lal","en","yes","no");

		List<String> list = new ArrayList<String>(Arrays.asList("hah","lal","en","yes","no"));
		
		Iterator<String> it  = strings.iterator();

		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		it  = list.iterator();
		for (int i = 0; i < 2; i++) {
			it.next();
			it.remove();//这里不能进行对strings进行remove  是因为这个list仅仅是对数组的的包装   数组有确切的长度  不能进行remove操作
		   //在使用迭代器的remove之前要先调用next
		}
		System.out.println(list);
		
		System.out.println("-------------------------------");
		
		ListIterator<String> listit = list.listIterator();
		
		while (listit.hasNext()) {
			String string = (String) listit.next();
			System.out.println(string+","+listit.nextIndex()+","+listit.previousIndex());
		}
		while (listit.hasPrevious()) {
			System.out.println(listit.previousIndex());
			listit.set("");
		}
	}
}
