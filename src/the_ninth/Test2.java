package the_ninth;

class Test2 implements TestInterface{

	public String dothings() {
		return "hasdone";
	}
	public TestInterface getinterface(){
		return new Test2();
	}
}

class Test3{

	public String dothings(){
		return "test3hasdone";
	}
	class InTest3 implements TestInterface{

		public String dothings() {
			return "InTest3hasdone";
		}

	}
	TestInterface getinterface(){
		return new InTest3();
	}

}