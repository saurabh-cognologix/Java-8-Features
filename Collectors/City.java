package StreamAPIJava8.Collectors;

public class City {
    private String city;
    private double temp;

    public City(String city, double temp) {
        this.city = city;
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", temp=" + temp +
                '}';
    }
}
