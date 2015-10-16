package the_fifteenth;

public class BaseGeneratorDome {
	public static void main(String[] args) {
		Generator<CountedObject> gen = BaseGenerator.create(CountedObject.class);
		for(int i = 0;i<5;i++){
			System.out.println(gen.next());
		}
		
		Generator<CountedObject> gen1 = BaseGenerator.create(CountedObject.class,new Object[]{5,6});
		gen1.next(new Class[]{int.class,int.class});
	}
}
