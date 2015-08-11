package the_eighth;

public class Main1 {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
class Glyph{
	void draw(){System.out.println("Glayph.draw");}

	Glyph(){
		System.out.println("before draw");
		draw();
		System.out.println("after draw");
	}
}
class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int r){
		this.radius = r;
		System.out.println("RoundGlyph.RoundGlyph(): "+radius);
	}

	@Override
	void draw() {
		System.out.println("RoundGlyph.draw(): "+radius);	
	}
}