import java.util.Arrays;

public class Monster {

	public final String TOMBSTONE = "Here Lies a Dead Monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPostion = 0;
	private int yPostition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	//Accessor methods
	public int getAttack()
	{
		return attack;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if(health < 0)
		{
			alive = false;
		}
	}
	
	public void setHealth(double decrease) // overloaded method
	{
		int intDecreaseHealth = (int) decrease;
		health = health - intDecreaseHealth;
		if(health < 0)
		{
			alive = false;
		}
	}
	
	public Monster(int health, int attack, int movement) // constructor
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}

	public Monster() //default constructor
	{
		
	}
	
	public Monster(int newHealth)
	{
		health = newHealth;
	}
	
	public Monster(int newHealth, int newAttack)
	{
		this(newHealth);
		attack = newAttack;
	}
	
}
