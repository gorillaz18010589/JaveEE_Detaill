package 多形;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("旺旺叫");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗狗吃飯");

	}

	@Override
	public void metaing(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println("狗狗交配");

	}

}
