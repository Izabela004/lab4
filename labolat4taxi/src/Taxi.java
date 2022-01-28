public class Taxi extends Auto {
    float[] zarobki=new float[12];

    public Taxi(){
        super();
        for(int i = 0; i<12; i++){
            zarobki[i] = (float)(Math.random()*101/10);
        }
    }
    float srZarobki(){
        float srednia = 0;
        for(int i = 0; i<12; i++){
            srednia += zarobki[i];
        }
        return srednia/12;
    }
    public void main(){
        Taxi ob = new Taxi();
        System.out.println("Sredni przebieg: " + ob.srPrzebieg());
        System.out.println("Srednie zarobki: " + ob.srZarobki());
    }
}