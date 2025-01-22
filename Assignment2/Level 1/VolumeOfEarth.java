class VolumeOfEarth {
   public static void main(String[] args) {
       double radius = 6378;
       double pi = 3.141592653589793;
       double volumeKm = (4.0 / 3.0) * pi * Math.pow(radius, 3);
       double Miles = volumeKm * 0.239913;
       System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
               " and cubic miles is " + Miles);
   }
}
