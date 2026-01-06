/**
 * Provides utility methods for integer-based distance calculations and unit conversions.
 */

public class IntegerTypes {
    /**
     * Calculates the sum of distances between two points or cities.
     *
     * @param cityA The distance value for the first city argument (A)
     * @param cityB The distance value for the second city argument (B)
     * @return The total combined distance as an integer.
     */
    public int totalDistanceCities(int cityA, int cityB){
        return cityA + cityB;
    }

    /**
     * Converts a distance from meters to kilometers.
     *
     * @param totalDistance The total distance in meters as a x long.
     * @return The distance converted to kilometers as an x int.
     * @throws ArithmeticException if the resulting kilometer value overflows an x int}.
     */
    public int meterToKilometer(long totalDistance){
        return Math.toIntExact((totalDistance/1000));
    }
}
