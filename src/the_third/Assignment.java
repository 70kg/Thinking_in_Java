package the_third;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 关于对象赋值
 * @author Mr_Wrong
 *
 */
class Tank{
	int level;
}
public class Assignment{
	public static void main(String[] args){
		Tank t1 = new Tank();
		Tank t2 = new Tank();

		t1.level = 9;
		t2.level = 21;

		System.out.println("原本的t1:"+t1.level+"  原本的t2:"+t2.level);

		t1 = t2;

		System.out.println("现在的t1:"+t1.level+"  现在的t2:"+t2.level);

		t1.level = 40;

		System.out.println("后来的t1:"+t1.level+"  后来的t2:"+t2.level);
		//--------------------------------
		String string = "0.1.2";

		String[] s = string.split("\\.");

		System.out.println(string.split("\\.")[0]+"");//在使用分割方法时，条件可以传正则表达式  有些字符要转意


		//-------------------------------
		
		int i = 1;
		System.out.println("i:"+i);
		System.out.println("i++ :"+ i++);//1
		System.out.println("++i :" + ++i);//3
		
		//------------------
		Integer n1 = new Integer(1);
		Integer n2 = new Integer(1);
		System.out.println(n1 == n2);//false
		System.out.println(n1 !=n2);//true
		
		
		//---------------
		class Value{
			int i;
		}
		Value v1 = new Value();
		Value v2 = new Value();
		System.out.println(v1.equals(v2));//false
		
		//---------------
		class Counter{
			int i;
			Counter(){
				i = 7;
			}
		}
		//-------------
		
		class Window{
			Window(int i){
				System.out.println("window:"+i);
			}
		}
		class House{
			Window w1 = new Window(1);
			House(){
				System.out.println("House()");
				w3 = new Window(33);
			}
			Window w2 = new Window(2);
			
			void f(){System.out.println("f()");}
			Window w3 = new Window(3);
		}
		
		House h= new House();
		h.f();
		
		//---------
		String date_string = "1438342560"+"000";
		Date date = new Date(Long.parseLong(date_string));
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		sFormat.format(date);
		
		System.out.println(sFormat.format(date));
		
		
	}
}