package Projects;

import java.util.ArrayList;

class ParkingRecord {
    String licensePlate;
    String spotNumber;

    public ParkingRecord(String licensePlate, String spotNumber) {
        this.licensePlate = licensePlate;
        this.spotNumber = spotNumber;
    }
}

public class ParkingLot {
    private ArrayList<ParkingRecord> records;

    public ParkingLot() {
        records = new ArrayList<ParkingRecord>();
    }

    public void parkCar(String licensePlate, String spotNumber) {
        records.add(new ParkingRecord(licensePlate, spotNumber));
    }

    public void removeCar(String licensePlate) {
        for (int i = 0; i < records.size(); i++){
            if (records.get(i).licensePlate.equals(licensePlate)){
                records.remove(i);
                return;
            }
        }
    }

    public boolean isParked(String licensePlate) {
        for (int i = 0; i < records.size(); i++){
            if (records.get(i).licensePlate.equals(licensePlate)) return true;
        }
        return false;
    }

    public int countCarsInRow(String rowLetter) {
        int count = 0;
        for (int i = 0; i < records.size(); i++){
            if (records.get(i).spotNumber.startsWith(rowLetter)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        // Example tests you can run:
         lot.parkCar("1ABC123", "A10");
         lot.parkCar("XYZ900", "A02");
         System.out.println(lot.isParked("XYZ900"));
         System.out.println(lot.countCarsInRow("A"));
         lot.removeCar("XYZ900");
         System.out.println(lot.isParked("XYZ900"));
    }
}
