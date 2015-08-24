package the_tenth;


public class Main3 {



	public static void main(String[] args) {
		RelaMain main = new RelaMain();
		Contents c = main.contents();
		Destination d = main.destination("laal");

		RelaMain.PDestination pd = main.new PDestination("hahah");
		//RelaMain.PContents pc = main.new PContents();访问不到  因为是private的\
		
		Destination dd = destination("lal");
		dd.readLabel();
		ParcelDestination.AnotherLevel.f();
	}


	private static class ParcelDestination implements Destination{
		private String label;
		ParcelDestination(String whereto){
			this.label = whereto;
		}
		public String readLabel() {
			return label;
		}
		static class AnotherLevel{
			public static void f(){};
		}

	}
	public static Destination destination(String s){
		return new ParcelDestination(s);
	}

}
class RelaMain{
	private class PContents implements Contents{
		private int i  = 1;
		public int value() {
			return i;
		}
	}
	protected class PDestination implements Destination{
		private String label;
		PDestination(String whereto){
			this.label = whereto;
		}
		public String readLabel() {
			return label;
		}
	}
	public Destination destination(String label){
		return new PDestination(label);
	}
	public Contents contents(){
		return new PContents();
	}
}
interface Destination{
	String readLabel();
}
interface Contents{
	int value();
}
