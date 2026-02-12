package Classworks.Classwork_3;

public class Runner {
    public static void main(String[] args) {

        Dragon d = new Dragon("Smaug", 200, 50, true, 15);
        Zombie z = new Zombie("Walker", 80, 15, 3, true);
        Creeper c = new Creeper("Boomer", 60, 30, false, 3);

        d.flameBurst();
        z.spreadVirus();
        c.prime();

        System.out.println(d.name + " HP: " + d.health);
        System.out.println(z.name + " rot: " + z.rotLevel);
        System.out.println(c.name + " fuse: " + c.fuseTime);
        
    }
}
