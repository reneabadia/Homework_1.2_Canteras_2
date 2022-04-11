public class Shuttle extends Unmanned {

    /**
     * Represents the shuttle spacecraft
     */

    double payload;

    public Shuttle(double payload, String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
        this.payload = payload;
    }

    /**
     * Method to calculate the payload
     */
    // Particular method
    public boolean calcPayload(){
        if (payload < this.maxThrust)
            return true;
        else
            return false;
    }

    /**
     * Set the message for launch mission
     */
    @Override
    public String launchMission() {
        System.out.println(payload);
        System.out.println(maxThrust);
        if (calcPayload()){return "The launching is possible";}
        else {return "The launching is unfeasible";}
    }

    /**
     * Set the message to abort mission
     */
    @Override
    public String abortMission() {
        return "Abort mission: turn off main engines after ignition.";
    }

}
