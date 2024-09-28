import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.get(licensePlate) == null) {
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (owners.get(licensePlate) != null) {
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        HashMap<String, String> ownersPrinted = new HashMap<>();
        for (String owner : owners.values()) {
            if (!ownersPrinted.containsKey(owner)) {
                System.out.println(owner);
                ownersPrinted.put(owner, owner);
            }
        }
    }
}
