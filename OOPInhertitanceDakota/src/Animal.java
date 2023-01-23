
public class Animal {
	private int weight;
	private int height;
	
public Animal (int weight, int height) {
	setWeight(weight);
	setHeight(height);
}//end Animal constructor


	
public int getWeight() {
	return weight;
}



public void setWeight(int weight) {
	this.weight = weight;
}



public int getHeight() {
	return height;
}



public void setHeight(int height) {
	this.height = height;
}



public String toString() {
	String result;
	result = "Weight: " + weight + "\nHeight: " + height;
	return result;
}//end toString
	
}//End Animal Class
