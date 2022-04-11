public class Robotic extends Unmanned{

    public Robotic(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
    }

    @Override
    public String launchMission() {
        return "Experimenting on the field of " + Astro;
    }

    @Override
    public String abortMission() {
        return "Abort mission: if possible send its data, and turn off batteries.";
    }

}
