public class WeatherWarning implements Observer{
    private  int ultimatemperatura;
    private  int umbral;
    public WeatherWarning(int umbral){
        this.umbral = umbral;

    }

    @Override
    public void update(int temperatura) {
        if (temperatura>umbral){
            System.out.println("¡Advertencia! La temperatura superó el umbral de" +"   " + umbral + "   "+"grados Celsius ");
        }
    }
}
