
import java.util.HashMap;
import java.util.Map;



public class map {
    public static void main(String args[]){

        Map<String,Integer> obj=new HashMap<String,Integer>();
        //Here Map is separete inteface it is not belongs to Collection

        obj.put("Prateek",104);
        obj.put("darshan",95);
        obj.put("Nithin",94);
        obj.put("Rithvik",121);
        //Here duplicate keys are not allowed

        System.out.println(obj);
        System.out.println(obj.keySet());
        System.out.println(obj.values());

        for(String name:obj.keySet())
            System.out.println(name);
        


    }
    
}
