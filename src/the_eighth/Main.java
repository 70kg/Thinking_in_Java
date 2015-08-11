package the_eighth;

import java.awt.datatransfer.StringSelection;

import the_eighth.Main.Note;
/**
 * 多态
 * @author Mr_Wrong
 *
 */
public class Main {
	//乐符枚举类
	public enum Note{
		C调,D调,E调
	}

	public static void tune(Instrument i){
		i.play(Note.D调);
	}
	public static void main(String[] args) {
		//		Wind wind = new Wind();
		//		tune(wind);
		Instrument instrument = new Wind();
		instrument.play(Note.D调);


		System.out.println(HandleRate("17000")+"");
		
		
	}
	private static int HandleRate(String rate){
		int i= Integer.parseInt(rate);
		return i/1000;
	}

}
/**
 * 乐器类
 * @author Mr_Wrong
 *
 */
class  Instrument{
	public void play(Note n){
		System.out.println("乐器正在演奏");
		secondmethod();
	}
	public void secondmethod(){
		System.out.println("父类的第二个方法");
	}
}
class Wind extends Instrument{
	@Override
	public void play(Note n) {
		super.play(n);
		System.out.println("笛子正在演奏:"+n);
	}
	@Override
	public void secondmethod() {
		System.out.println("子类的第二个方法");
	}
}