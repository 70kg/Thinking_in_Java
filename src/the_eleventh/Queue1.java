package the_eleventh;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 队列
 * @author Mr_Wrong
 *
 */
public class Queue1 {
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		Random random = new Random(47);

		for (int i = 0; i < 10; i++) {
			queue.offer(random.nextInt(10));//不删除情况下插入队尾
		}
		printQ(queue);

		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "womendezuguoshi".toCharArray()) {
			qc.offer(c);
		}
		printQ(qc);
	}

	private static void printQ(Queue queue){
		while(queue.peek()!=null){//返回对首  没有为Null
			System.out.println(queue.remove()+"");
		}
	}
}
