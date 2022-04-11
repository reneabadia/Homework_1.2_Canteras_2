public class Probe extends Unmanned{

    public Probe(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
    }

    @Override
    public String launchMission() {
        return "Exploring into deep space near " + Astro;
    }

    @Override
    public String abortMission() {
        return "Abort mission: turn off and farewell.";
    }


}
