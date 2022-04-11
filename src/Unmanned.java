public abstract class Unmanned implements iSpaceCraft {

    public String Astro, shipName, originCountry;
    public int propellantType;
    public double shipMass, maxThrust;

    // Object SpaceCraft
    public Unmanned(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass){
        this.shipName = shipName;
        this.originCountry = originCountry;
        this.propellantType = propellantType;
        this.maxThrust = maxThrust;
        this.shipMass = shipMass;
    }

    // Astronomical object to Study
    public String setAstro(String Astro){
        this.Astro = Astro;
        return this.Astro;
    }

}
