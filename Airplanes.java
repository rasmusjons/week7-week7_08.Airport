
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Airplanes {

    private String id;
    private int capacity;
    private HashMap<String, Integer> planeList;

    public Airplanes() {
        planeList = new HashMap<String, Integer>();
    }

    public void addPlane(String id, int capacity) {
        this.planeList.put(id, capacity);

    }

    public void printPlanes() {
        for (String name : planeList.keySet()) {
            String key = name;
            String value = planeList.get(name).toString();
            System.out.println(key + " ("+ value + " ppl)");
        }

    }
                   
    public String getAirplane(String id){
        
        return id + " (" + planeList.get(id) + " ppl)"; 
        
    }                       

    public String toString() {
        return id + capacity;

    }

}
