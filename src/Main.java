
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temp1 = new TemperatureDisplay();
        WeatherWarning temp2 = new WeatherWarning(34);


        temp1.update(30);
        temp2.update(60);

    }
}