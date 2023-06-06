public class MountainData {

  private String name;
  private String country;
  private double elevation;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public double getElevation() {
    return this.elevation;
  }

  public void setElevation(int elevation) {
    this.elevation = elevation;
  }

  public static double toMeters(double elevation){
        return elevation / 3.2808;
  }
}
