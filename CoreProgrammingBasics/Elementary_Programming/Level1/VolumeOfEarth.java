public class VolumeOfEarth {
    public static void main(String[] args) {
        int radius=6378;
        double volumeKm=(4/3)*Math.PI*(radius^3);
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
