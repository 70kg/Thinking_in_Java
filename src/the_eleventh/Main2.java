package the_eleventh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 栈
 * @author Mr_Wrong
 *
 */
public class Main2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "my dog is dog ha ha ha".split(" ")) {
			stack.push(s);
		}
		while(!stack.empty()){
			System.out.println(stack.pop());
		}


		Random rand = new Random();
		Set<Integer> intset = new HashSet<Integer>();

		for (int i = 0; i < 100; i++) {
			intset.add(rand.nextInt(10));
		}
		System.out.println(intset);
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("5", "one");
		map.put("20", "two");
		map.put("60", "three");

		System.out.println(map.keySet());//但是都是乱序的  
		

	}
}
class Stack<T>{
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v){storage.addFirst(v);}
	public T peek(){return storage.getFirst();}
	public T pop(){return storage.removeFirst();}
	public boolean empty(){return storage.isEmpty();}
	public String tosString(){return storage.toString();}
}