package the_sevent;
/**
 * 空的final
 * @author Mr_Wrong
 *
 */
public class BlankFinal {

	private final int j;
	private final Popet p;
	public BlankFinal(){
		j = 1;
		p = new Popet(1);
	}
	public BlankFinal(int i){
		j = i;
		p = new Popet(i);
		
	}
	public static void main(String[] args) {
		BlankFinal b1 = new BlankFinal();
		new BlankFinal(20);

		System.out.println(b1.j +"");
	}
}
class Popet{
	int i;
	Popet(int i){
		this.i = i;
	}
}
