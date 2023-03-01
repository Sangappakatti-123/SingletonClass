package singleton;

public class Pen {
       private static Pen ref;
       
       private Pen() {
    	   System.out.println(" executing pen constructor");
       }
       public static Pen getInstance() {
    	   if(ref==null) {
    		   ref=new Pen();
    	   }
    	   return ref;
       }
}
