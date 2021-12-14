package strategy;

public class Hero {
	private String name;
	private int hp = 500;
	private int mp = 200;
	private int strength = 150; //力量
	private int wisdom = 80;//智例
	private int defense = 50;
	private Skill skill;
	
	public enum Skill{
		COLLIDING, WATERBALL
	}
	
	public Hero (String name, Skill skills) {
		this.name = name;
		this.skill = skills;
	}
	
	public void attack(Hero tragetHero) {
		switch (skill) {
		case COLLIDING:
			System.out.println("%s 使用了衝撞攻擊");
			break;
		case WATERBALL:
			
			break;
		}
	}
}


