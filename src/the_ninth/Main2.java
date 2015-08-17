package the_ninth;
/**
 * 适配器模式
 * @author Mr_Wrong
 *
 */
public class Main2 {
	public static void main(String[] args) {
		
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		
	}
}
class Waveform{
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return "Waveform:"+id;
	}
}

class Filter{
	public String name(){
		return getClass().getSimpleName();
	}
	public Waveform process2(Waveform input){
		return input;
	}
}
class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff){
		this.cutoff = cutoff;
	}
	@Override
	public Waveform process2(Waveform input) {
		return input;
	}
}





interface Processor2{
	String name();
	Object process(Object input);
}
class Apply{
	public static void process(Processor2 p,Object s){
		System.out.println("使用："+p.name());
		System.out.println(p.process(s));
	}
}
class FilterAdapter implements Processor2{
	Filter filter;
	public FilterAdapter(Filter filter){
		this.filter = filter;
	}
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}

	public Waveform process(Object input) {
		// TODO Auto-generated method stub
		return filter.process2((Waveform) input);
	}

}