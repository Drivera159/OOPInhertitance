
public class Dog extends Animal {
private String name;
private String breed;

public Dog(int weight, int height, String name, String breed) {
	super(weight, height);
	setName(name);
	setBreed(breed);
}//end Dog 



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getBreed() {
	return breed;
}



public void setBreed(String breed) {
	this.breed = breed;
}



@Override
public String toString() {
	String result;
	result = "Dog's Name: " + name + ". \nThe Dog's Breed: " + breed + "\n" + super.toString();
	return result;
}//end toString




}//End Dog Class
