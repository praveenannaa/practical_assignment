package phase1;

public class Constructor {
	  int id;  
	    String name;  
	    //constructor to initialize integer and string  
	    Constructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //constructor to initialize another object  
	    Constructor(Constructor s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	Constructor s1 = new Constructor (1119,"praveen");  
	    	Constructor s2 = new Constructor (s1);  
	    s1.display();  
	    s2.display();  
	   }  

}
