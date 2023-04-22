import java.util.*;
class Animal {
private String sound;

public Animal(String sound){
this.sound = sound;
}
}

class Bird extends Animal {
public Bird(String sound){
super(sound);
}
public void fly(){
System.out.println("The Bird is flying");
}
}

class Mammal extends Animal {
public Mammal(String sound){
super(sound);
}
public void walk(){
System.out.println("The Mammal is walking");
}
}

class Reptile extends Animal {
public Reptile(String sound){
super(sound);
}

public void move(){
System.out.println("The Reptiles are moving");
}
}

class ZooKeeper{
private String zooKeeperName;
void feedAnimal(Animal animal){

}

public ZooKeeper(String zooKeeperName){
this.zooKeeperName = zooKeeperName; 
}
}

public class Zoo{
	public static void main(String[] args){
	Animal animal = new Animal("Bark");
	animal.feedAnimal(bird);
	animal.fly();
	animal.walk();
	animal.move();

	ZooKeeper zooKeeper = new ZooKeeper("Ravindr");
	zooKeeper.feedAnimal(bird);
	}
}