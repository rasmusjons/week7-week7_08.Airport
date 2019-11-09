
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Flight {

    private ArrayList<String> flightList = new ArrayList();

    private String tofrom;

    public Flight() {

    }

    public Flight(Airplanes plane, String tofrom) {
      
    }

    public void addFlight(String flight) {
        this.flightList.add(flight);

    }

    public String printFlights() {
      String output = "";
        for (String flights : flightList){
           output += flights; 
       }
        return output; 
    }

}

