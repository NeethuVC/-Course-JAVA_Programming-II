
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate lid = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");

//        System.out.println(li1.hashCode());
//        System.out.println(lid.hashCode());
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

        VehicleRegistry vr = new VehicleRegistry();
        vr.add(new LicensePlate("FI", "AAA-111"), "Arto");
        
        vr.add(new LicensePlate("FI", "BBB-222"), "Pekka");
        
        vr.printLicensePlates();
        System.out.println(vr.get(new LicensePlate("FI", "AAA-111")));
    }
}
