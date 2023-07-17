public enum SolarSystem {

    MERCURY     (0, 10, null),
    VENUS       (10, 20, MERCURY),
    EARTH       (30, 25, VENUS),
    MARS        (15, 60, EARTH),
    JUPITER     (93, 22, MARS),
    SATURN      (72, 10, JUPITER),
    URANUS      (21, 99, SATURN),
    NEPTUNE     (43, 34, URANUS);

    private int positionNumberFromSun = 1;
    public final int distanceFromPreviousPlanet;
    public final int distanceToSun;
    public final int radius;
    private SolarSystem prevPlanet;
    private SolarSystem nextPlanet;

    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.distanceFromPreviousPlanet = prevDistance;
        this.radius = radius;
        this.distanceToSun = previous.distanceToSun + prevDistance;
        positionNumberFromSun = previous.positionNumberFromSun + 1;
        prevPlanet = previous;
        previous.nextPlanet = this;
    }

    public SolarSystem prev() {
        return this == MERCURY ? null : prevPlanet;
    }

    public SolarSystem next() {
        return this == NEPTUNE ? null : nextPlanet;
    }

    public int getPositionNumberFromSun() {
        return positionNumberFromSun;
    }
}
