public class Robotic extends Unmanned{

    /**
     * Represents the probe spacecraft
     */

    public Robotic(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
    }

    /**
     * Set the message for launch mission
     */
    @Override
    public String launchMission() {
        return "Experimenting on the field of " + Astro;
    }

    /**
     * Set the message to abort mission
     */
    @Override
    public String abortMission() {
        return "Abort mission: if possible send its data, and turn off batteries.";
    }

}
