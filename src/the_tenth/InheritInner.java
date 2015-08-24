package the_tenth;

class WidthInner {
	class Inner{}
}

public class InheritInner extends WidthInner.Inner{
	InheritInner(WidthInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		WidthInner wi = new WidthInner();
		InheritInner hi = new InheritInner(wi);

	}
}
