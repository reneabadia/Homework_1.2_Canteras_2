public class Satellite extends Unmanned{

    /**
     * Represents the probe spacecraft
     */

    public Satellite(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
        this.propellantType = 0;
        this.maxThrust = 0;
    }

    /**
     * Set the message for launch mission
     */
    @Override
    public String launchMission() {return "Orbiting around " + Astro;
    }

    /**
     * Set the message to abort mission
     */
    @Override
    public String abortMission() {
        return "Abort mission: fall out of orbit.";
    }

}
