
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

	}
}