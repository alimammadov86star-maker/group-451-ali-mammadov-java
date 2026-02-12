package Homeworks.Project1;

public class Runner {
	public static void main(String[] args) {
		
		Dog d1 = new Dog("Dog1", 3, "Husky");
		d1.bark();
		d1.eat();
		d1.sleep();
		
		Cat c1 = new Cat("Cat1", 2, "British Shorthair");
		c1.meow();
		c1.eat();
		c1.sleep();
		
		Cow co1 = new Cow("Cow1", 5, "Holstein");
		co1.moo();
		co1.eat();
		co1.sleep();
		
		Sheep s1  = new Sheep("Sheep1", 5, "Holstein");
		s1.baa();
		s1.eat();
		s1.sleep();
		
		Horse h1 = new Horse("Horse1", 5, "Arabian");
		h1.neigh();
		h1.eat();
		h1.sleep();
		
		Lion l1 = new Lion("lion1", 2, "African");
		l1.roar();
		l1.eat();
		l1.sleep();
		
		Triger t1 = new Triger("tiger1", 2, "Bengal");
		t1.growl();
		t1.eat();
		t1.sleep();
		
		Wolf w1 = new Wolf("wolf1", 2, "Gray");
		w1.howl();
		w1.eat();
		w1.sleep();
		
		Fox f1 = new Fox("fox1", 2, "Red");
		f1.scream();
		f1.eat();
		f1.sleep();	
		
		Bear b1 = new Bear("bear1", 2, "Brown");
		b1.grunt();
		b1.eat();
		b1.sleep();	
		
		Elephant e1 = new Elephant("elephant1", 2, "African");
		e1.trumpet();
		e1.eat();
		e1.sleep();	
		
		Monkey m1 = new Monkey("Monkey1", 2, "Capuchin");
		m1.chatter();
		m1.eat();
		m1.sleep();	
		
		Chicken ch1 = new Chicken("Chicken1", 2, "Leghorn");
		ch1.cluck();
		ch1.eat();
		ch1.sleep();	
		
		Rooster r1 = new Rooster("Rooster1", 2, "Plymouth Rock");
		r1.crow();
		r1.eat();
		r1.sleep();	
		
		Duck du1 = new Duck("Duck1", 2, "Mallard");
		du1.quak();
		du1.eat();
		du1.sleep();	
		
		Panda p1 = new Panda("Panda1", 2, "Mallard");
		p1.eatBamboo();
		p1.eat();
		p1.sleep();
		
		Zebra z1 = new Zebra("Panda1", 2, "Mallard");
		z1.runfast();
		z1.eat();
		z1.sleep();
		
		Girrafe g1 = new Girrafe("g1", 2, "Mallard");
		g1.reachHighLeaves();
		g1.eat();
		g1.sleep();
	}
}