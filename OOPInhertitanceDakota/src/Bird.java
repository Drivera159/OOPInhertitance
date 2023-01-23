
public class Bird extends Animal {
private int wingspan;
private boolean canFly;



public Bird(int weight, int height, int wingspan, boolean canFly) {
	super(weight, height);
	setWingspan(wingspan);
	setCanFly(canFly);
}//end bird constructor

public int getWingspan() {
	return wingspan;
}

public void setWingspan(int wingspan) {
	this.wingspan = wingspan;
}

public boolean isCanFly() {
	return canFly;
}

public void setCanFly(boolean canFly) {
	this.canFly = canFly;
}



@Override
public String toString() {
String result;
result = "This bird's wingspan is " + wingspan + ". \nBeing able to fly is: " + canFly + "\n" + super.toString();
return result;
}//end toString


	
}//end Bird class
