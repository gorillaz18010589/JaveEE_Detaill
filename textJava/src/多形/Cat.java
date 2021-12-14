package 多形;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("喵喵叫");
	}

	@Override
	public void eat() {
		System.out.println("貓咪吃飯");
	}

	@Override
	public void metaing(Animal animal) {
		System.out.println("貓咪交配");
	}
	
	public void attack() {
		System.out.println("貓咪特有方法攻擊");
	}

}
