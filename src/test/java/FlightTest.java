import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {

    Flight flight;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void setUp() {
        flight = new Flight("Dubai","London","15:30", 4);
        cabinCrewMember1 = new CabinCrewMember("Jean","Cabin Manager");
        cabinCrewMember2 = new CabinCrewMember("Michael","Cabin Crew");
        pilot = new Pilot("Sandra","Captain", 12345);
        passenger1 = new Passenger("Lily",2);
        passenger2 = new Passenger("Steve",1);
        passenger3 = new Passenger("Graham",3);
        flight.addPilot(pilot);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);

    }

    @Test
    public void canFindPassenger(){
        Passenger foundPassenger = flight.findPassenger("Lily");
        assertEquals(passenger1, foundPassenger);
    }

    @Test
    public void canCheckCurrentPassengersNumber(){
        assertEquals(3,flight.flightCurrentPassengers());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(new Passenger("Ted",2));
        assertEquals(4, flight.flightCurrentPassengers());
    }

    @Test
    public void canNotAddPassenger(){
        flight.addPassenger(new Passenger("Ted",2));
        flight.addPassenger(new Passenger("Ted",2));
        assertEquals(4, flight.flightCurrentPassengers());
    }

    @Test
    public void canCheckAvailableSeats(){
        assertEquals(1,flight.checkCurrentAvailableSeats());
    }










}
