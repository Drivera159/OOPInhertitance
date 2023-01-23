
public class Cat extends Animal {
private String name;
private int lives;


public Cat(int weight, int height, String name, int lives) {
	super(weight, height);
	setName(name);
	setLives(lives);
}//end Cat Constructor

public String getName() {
	return name;
}//end getName

public void setName(String name) {
	this.name = name;
}//end setName

public int getLives() {
	return lives;
}//end getLives

public void setLives(int lives) {
	this.lives = lives;
}//end setLives

@Override
public String toString() {
	String result;
	result = "Cat's Name: " + name + "\nIt has " + lives +  " lives left." + "\n" + super.toString();
	return result;
}//end ToString


}//end Cat Class
