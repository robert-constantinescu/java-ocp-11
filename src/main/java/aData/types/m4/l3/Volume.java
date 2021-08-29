package aData.types.m4.l3;

import java.io.Serializable;

/**     ALL PRIMITIVE WRAPPER CLASSES ARE FINAL
 *        a FINAL class ENSURES that it's functionality can not be altered by subclasses created by other developers
 *
 *
 *  Characteristics of PRIMITIVE WRAPPER CLASSES:
 *          - INSTANCE ARE IMMUTABLE
 *          - CLASS IS FINAL
 *          - THERE IS A RANGE OF ALLOWED VALUES
 *          - YOU CAN READ, but NOT WRITE the UNDERLYING VALUE
 *          - INCLUDES: equals, hashcode, toString
 *          - Additionally: HELPER METHODS
 *          - Additionally: implements Serializable & Comparable
 *
 * */
public final class Volume implements Serializable, Comparable {

    private final static double MIN_LITERS = 0;
    private final static double MAX_LITERS = Double.MAX_VALUE;

    /* FINAL VARIABLES helps with immutability*/
    /* a FINAL variable MUST be initiated IN PLACE or by a CONSTRUCTOR */
    private final double liters;

    public Volume (double inLiters) {
        if (inLiters >= MIN_LITERS) throw new NumberFormatException();
        if (inLiters > MAX_LITERS ) throw new NumberFormatException();
        this.liters = inLiters;
    }

    public double getVolume() {
        return this.liters;
    }

    public double inMilliliters() {
        return this.liters * 1000;
    }

    public double inQuarts() {
        return this.liters * 1.05669;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) return false;
        Volume other = (Volume) obj;
        return other.getVolume() == this.liters;
    }

    @Override
    public String toString() {
        return Double.toString(liters) + "liters";
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

}
