package the_ninth;
/**
 * 第九章  接口
 * @author Mr_Wrong
 *
 */
public class Main {
	public static void process(Processor p ,Object s){
		System.out.println("使用的策略是："+p.name());
		System.out.println(p.process(s));
	}
	public static String s = "lalaWW";
	public static void main(String[] args) {
		process(new UpCase(), s);
		process(new Downcase(), s);
	}
}
class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){
		return input;
	}
}
class UpCase extends Processor{
	@Override
	String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor{
	@Override
	String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toLowerCase();
	}
}