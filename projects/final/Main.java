import java.util.ArrayList;

public class Main {

    public static void minElevation(ArrayList<MountainData> data) {
        double minElevation = data.get(0).getElevation();
        String name = data.get(0).getName();
        String country = data.get(0).getCountry();

        for (MountainData datum : data) {
            if (minElevation > datum.getElevation()) {
                minElevation = datum.getElevation();
                name = datum.getName();
                country = datum.getCountry();
            }
        }
            System.out.println("Mountain with the lowest elevation...");
            System.out.println("Name: " + name);
            System.out.println("Country: " + country);
            System.out.println("Elevation: " + minElevation);
    }

    public static void main(String[] args) {
        MountainData oneMountain = new MountainData();
        MountainData twoMountain = new MountainData();
        MountainData threeMountain = new MountainData();
        MountainData fourMountain = new MountainData();
        MountainData fiveMountain = new MountainData();
        MountainData sixMountain = new MountainData();
        MountainData sevenMountain = new MountainData();

        oneMountain.setName("Chimborazo");
        oneMountain.setCountry("Ecuador");
        oneMountain.setElevation(20549);

        twoMountain.setName("Matterhorn");
        twoMountain.setCountry("Switzerland");
        twoMountain.setElevation(14692);

        threeMountain.setName("Olympus");
        threeMountain.setCountry("Greece (Macedonia)");
        threeMountain.setElevation(9573);

        fourMountain.setName("Everest");
        fourMountain.setCountry("Nepal");
        fourMountain.setElevation(29029);

        fiveMountain.setName("Mount Marcy - Adirondacks");
        fiveMountain.setCountry("United States");
        fiveMountain.setElevation(5344);

        sixMountain.setName("Mount Mitchell - Blue Ridge");
        sixMountain.setCountry("United States");
        sixMountain.setElevation(6684);

        sevenMountain.setName("Zugspitze");
        sevenMountain.setCountry("Switzerland");
        sevenMountain.setElevation(9719);

        ArrayList<MountainData> mountains = new ArrayList<MountainData>();
        mountains.add(oneMountain);
        mountains.add(twoMountain);
        mountains.add(threeMountain);
        mountains.add(fourMountain);
        mountains.add(fiveMountain);
        mountains.add(sixMountain);
        mountains.add(sevenMountain);
        System.out.printf(
                "| %27s | %18s | %9s | %16s |\n",
                "Name",
                "Country",
                "Elevation",
                "Meter Elevation"
        );
        for (int i = 0; i < 83; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (MountainData mountainData : mountains) {
            double elevation = mountainData.getElevation();
            double meterElevation = MountainData.toMeters(elevation);
            System.out.printf(
                    "| %27s | %18s | %9s | %16s |\n",
                    mountainData.getName(),
                    mountainData.getCountry(),
                    elevation,
                    String.format("%.3f", meterElevation)
            );
        }
        System.out.println();
        minElevation(mountains);
    }
}
