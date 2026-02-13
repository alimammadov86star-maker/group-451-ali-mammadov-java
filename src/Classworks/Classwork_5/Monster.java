package Classworks.Classwork_5;

public class Monster {

    protected String type;
    protected int health;
    protected int damage;

    public Monster(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(type + " monster attacks with damage " + damage);
    }

    public void roar() {
        System.out.println(type + " monster roars!");
    }

    public void specialAbility() {
        System.out.println(type + " uses a special ability!");
    }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) {
        	health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getDamage() {
    	return damage; 
    }
}

class FireMonster extends Monster {
    public FireMonster() { 
    	super("Fire", 80, 15); 
    }
    @Override
    public void specialAbility() { 
    	System.out.println("Fire monster throws a fireball!"); 
    }
}

class IceMonster extends Monster {
    public IceMonster() { super("Ice", 70, 12); }
    @Override
    public void specialAbility() { 
    	System.out.println("Ice monster freezes the enemy!"); 
    }
}

class PoisonMonster extends Monster {
    public PoisonMonster() {
    	super("Poison", 60, 18); 
    }
    @Override
    public void specialAbility() {
    	System.out.println("Poison monster releases toxic gas!"); 
    }
}

