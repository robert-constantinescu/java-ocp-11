package cJavaObjectOrientedApproach.m5.demo.abstractClasses.geography;

public abstract class Shape {

    /*
        all SHAPES need to be convertible to wkt: convertToWkt()
     */
    public String toWkt() {
        /*
            The toWkt(), defines the STEPS needed to perform a conversion:
            Step 1: transform the shape to wkt using  this.convertToWkt();
         */
        String wkt = this.convertToWkt();

        /*
            Step 2 is to check if the wkt shape is valid
         */
        if (this.isWktValid(wkt)) {
            return wkt;
        }
        throw new RuntimeException("Can not draw shape");
    }

    /*
        Each class MUST implement it's own convertToWkt() method
     */
    protected abstract String convertToWkt();


    /*
        the validation is implemented at the base class level, because it's common logic that can be reused
        this method is private, and it is going to be USED ONLY by the SHAPE class
     */
    private boolean isWktValid(String wkt) {
        if (wkt == null || wkt.length() == 0) {
            return false;
        }

        return wkt.startsWith("POINT") ||
                wkt.startsWith("LINESTRING") ||
                wkt.startsWith("POLYGON");
    }
}
