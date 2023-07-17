import javax.swing.plaf.IconUIResource;

public enum Planet {

    private int positionNumberFromSun;
    private int count = 1;

    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NUPTUNE


    Planet () {
        positionNumberFromSun = count;
        count++;


    }
    }