public class CabinCrewMember extends AirlineEmployees {

    private String name;

    private String rank;


    public CabinCrewMember(String name, String rank) {
        super(name,rank);
    }


    public String giveMessage() {
        return "Please be seated";
    }
}
