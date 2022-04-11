public class Probe extends Unmanned{

    /**
     * Represents the probe spacecraft
     */

    public Probe(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
    }

    /**
     * Set the message for launch mission
     */
    @Override
    public String launchMission() {
        return "Exploring into deep space near " + Astro;
    }

    /**
     * Set the message to abort mission
     */
    @Override
    public String abortMission() {
        return "Abort mission: turn off and farewell.";
    }


}
