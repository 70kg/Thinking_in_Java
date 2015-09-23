import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*public class Test {
	public static void main(String[] args) {
		float f = 17;;
		//System.out.println(f/100);

		float i = 1641004;
		float ii = 2000000;

		//System.out.println((int)((i/ii)*100));


		//String filetext = "张小名=25分|李小花=43分|王力=100分|";
		String filetext = "<span class="+"prev-next-page"+">2/10页</span>";

		Pattern p = Pattern.compile("[\\d*]");//正则表达式，取=和|之间的字符串，不包括=和|
		Matcher m = p.matcher(filetext);
		StringBuilder sb = new StringBuilder();
		while(m.find()) {
			sb.append(m.group());
		}
		System.out.print(sb.toString().subSequence(1, sb.toString().length()));//m.group(1)不包括这两个字符
	}

}*/

public class Test { 
	public static void main(String[] args) throws ExecutionException, InterruptedException { 
		//创建一个线程池 
		ExecutorService pool = Executors.newFixedThreadPool(2); 
		//创建两个有返回值的任务 
		Callable c1 = new MyCallable("A"); 
		Callable c2 = new MyCallable("B"); 
		//执行任务并获取Future对象 
		
		Future f1 = pool.submit(c1); 
		Future f2 = pool.submit(c2); 
		//从Future对象上获取任务的返回值，并输出到控制台 
		System.out.println(">>>"+f1.get().toString()); 
		System.out.println(">>>"+f2.get().toString()); 
		//关闭线程池 
		pool.shutdown(); 
	} 
} 

class MyCallable implements Callable{ 
	private String oid; 

	MyCallable(String oid) { 
		this.oid = oid; 
	}

	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return oid+"任务返回的内容";
	} 
}
