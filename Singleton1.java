package singleton;

public class Singleton1 {
      public static void main(String[] args) {
    	  
		//Pen p1=new Pen();
		//Pen p2=new Pen();
		Pen p1=Pen.getInstance();
		System.out.println(p1.hashCode());
		Pen p2=Pen.getInstance();
		System.out.println(p2.hashCode());
    	  
	}
}
