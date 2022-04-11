public class Satellite extends Unmanned{

    public Satellite(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass) {
        super(shipName, originCountry, propellantType, maxThrust, shipMass);
        this.propellantType = 0;
        this.maxThrust = 0;
    }

    @Override
    public String launchMission() {return "Orbiting around " + Astro;
    }

    @Override
    public String abortMission() {
        return "Abort mission: fall out of orbit.";
    }

}
