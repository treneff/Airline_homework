public class Pilot extends AirlineEmployees {

    private String name;

    private String rank;

    private int licenseNum;



    public Pilot(String name, String rank, int licenseNum) {
        super(name,rank);
        this.licenseNum = licenseNum;
    }


    public int getLicenseNum() {
        return licenseNum;
    }

    public String allowedToFly(){
        return "I can fly";
    }
}
