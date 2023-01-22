public abstract class AirlineEmployees {

    private String name;

    private String rank;

    public AirlineEmployees(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }
}
