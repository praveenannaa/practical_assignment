package phase1;
import java.util.*;  

public class Map_Uses {
	public static void main(String[] args) {  
	    Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"annaa");  
	    map.put(5,"Rock");  
	    map.put(2,"Jayaram");  
	    map.put(6,"Amithsha");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}  

}
