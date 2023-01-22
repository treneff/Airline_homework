import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    private ArrayList<Passenger> passengers;

    private ArrayList<Pilot> pilots;

    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private int seats;

    private String destination;

    private String departureAirport;

    private String departureTime;
    public Flight(String destination, String departureAirport, String departureTime, int seats) {
        this.passengers = new ArrayList<Passenger>();
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seats = seats;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void addPassenger(Passenger passenger){
        if(flightCurrentPassengers() < this.seats ){
        this.passengers.add(passenger);
        }
    }

    public Passenger findPassenger(String passengerName) {
        Passenger foundPassenger = null;
        for (Passenger passenger : this.passengers) {
            if (passenger.getName() == passengerName) {
                foundPassenger = passenger;
            }
        }
        return foundPassenger;
    }


    public int flightCurrentPassengers(){
        return this.passengers.size();
    }

    public int checkCurrentAvailableSeats(){
        return this.seats - this.passengers.size();
    }




}
