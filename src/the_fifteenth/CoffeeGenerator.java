package the_fifteenth;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>{

	private Class[] types = {Mocha.class,Coffee.class,Mocha.class};
	private static Random random = new Random(47);
	private int size = 0;
	public CoffeeGenerator(){}
	public CoffeeGenerator(int size){this.size= size;}
	
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
	public void forEach(Consumer<? super Coffee> action) {
	}

	public Spliterator<Coffee> spliterator() {
		return null;
	}

	public Coffee next(){
		try {
			return (Coffee) types[random.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	
	
	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;

		public boolean hasNext() {
			return count>0;
		}

		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public void forEachRemaining(Consumer<? super Coffee> action) {

		}

	}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0;i<5;i++){
			System.out.println(gen.next());
		}
		for(Coffee c:new CoffeeGenerator(5)){
			System.out.println(c);
		}
	}
	public Coffee next(Class<?>... agrs) {
		// TODO Auto-generated method stub
		return null;
	}

}
