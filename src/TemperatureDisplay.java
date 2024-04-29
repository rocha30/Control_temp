public class TemperatureDisplay implements Observer{
    private int ultimatemp;


    @Override
    public void update(int temperatura) {
        ultimatemp = temperatura;
        System.out.println("La temperatura es "+ ultimatemp);
    }
}
