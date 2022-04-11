public abstract class Unmanned implements iSpaceCraft {

    /**
     * Represents the data for the unmanned mission
     */

    public String Astro, shipName, originCountry;
    public int propellantType;
    public double shipMass, maxThrust;

    /**
     * Object to determine the properties of an unmanned SpaceCraft
     */
    // Object SpaceCraft
    public Unmanned(String shipName, String originCountry, int propellantType, double maxThrust, double shipMass){
        this.shipName = shipName;
        this.originCountry = originCountry;
        this.propellantType = propellantType;
        this.maxThrust = maxThrust;
        this.shipMass = shipMass;
    }

    /**
     * Save the celestial body to study entered by the user
     */
    // Astronomical object to Study
    public String setAstro(String Astro){
        this.Astro = Astro;
        return this.Astro;
    }

}
