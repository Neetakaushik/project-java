package StringPrograM;

class shape{  //class name is shape.
public void show (){ // method
    System.out.println("This is a Shape");
}}
class Rectangle extends shape { //2nd class 
  public  void show1(){ //method 
        System.out.println("This is Rectangle shape");
    }}
class Circle extends shape { // 3rd class
     public void  show2(){ //method 
          System.out.println("This is a circle shape");
      }}
class square extends Rectangle {
   public void show(){ //3rd class
        System.out.println("Square is a Rectangle");
    }
}
  


public class Shape {//main class

	public static void main(String[] args) {
		square s = new square (); //object
	    s.show();//method calling 
	    s.show1();//method calling

	}

}//ending
