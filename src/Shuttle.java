public class Shuttle extends Unmanned {

    double payload;


    public Shuttle(double payload, String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
        this.payload = payload;
    }

    // Particular method
    public boolean calcPayload(){
        if (payload < this.maxThrust)
            return true;
        else
            return false;
    }

    @Override
    public String launchMission() {
        System.out.println(payload);
        System.out.println(maxThrust);
        if (calcPayload()){return "The launching is possible";}
        else {return "The launching is unfeasible";}
    }

    @Override
    public String abortMission() {
        return "Abort mission: turn off main engines after ignition.";
    }

}
