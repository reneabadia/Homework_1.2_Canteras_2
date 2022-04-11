public class Manned implements iSpaceCraft{

    public int crewSize;
    public String shipName, originCountry;
    public int propellantType, task;
    public double shipMass, maxThrust;

    // Object SpaceCraft
    public Manned(int task, int crewSize, String shipName, String originCountry, int propellantType, double maxThrust, double shipMass){
        this.task = task;
        this.crewSize = crewSize;
        this.shipName = shipName;
        this.originCountry = originCountry;
        this.propellantType = propellantType;
        this.maxThrust = maxThrust;
        this.shipMass = shipMass;
    }

    @Override
    public String launchMission() {
        String mission = "";
        if (this.task==1){mission="Lunar";}
        else if (this.task==2){mission="Zero gravity experiment";}
        else if (this.task==3){mission="Maintenance";}
        return this.shipName + "'s crew takes off on mission type: " + mission;
    }

    @Override
    public String abortMission() {
        return "Abort mission: initialize evacuation protocol.";
    }

}
