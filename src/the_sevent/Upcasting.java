package the_sevent;
/**
 * 向上转型
 * @author Mr_Wrong
 *
 */
public class Upcasting {
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setname("小明");
		Student student2 = new Student();
		student2.setname("小强");

		student1.FightWith(student2);
	}
}
class Person{
 protected String name;
 void setname(String name){
	 this.name = name;
 }
	public void eat(){System.out.println("吃饭");}
	public void fight(){System.out.println("打架");}

	public void FightWith(Person p){
		p.fight();
		System.out.println(name+"和"+p.name+"打架");
	}
}
class Student extends Person{
	
	public void learn(){System.out.println("学习");}


}