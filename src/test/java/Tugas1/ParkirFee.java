package Tugas1;

public class ParkirFee {
    public static void main(String[] args) {
        int hoursParked = 8;
        double fee = calculateParkingFee(hoursParked);
        System.out.println("The parking fee is: $" + fee);
    }

    public static double calculateParkingFee(int hoursParked) {
        double baseRate = 1.0;
        double additionalRate = 0.5;
        double flatFee = 15.0;


        if (hoursParked <= 5) {
            return baseRate;
        } else if (hoursParked > 24 ){
            return flatFee + additionalRate * (hoursParked - 24);
        } else if (hoursParked == 24 ){
            return flatFee;
        } else {
            return baseRate + additionalRate * (hoursParked - 5);
        }
    }
}
