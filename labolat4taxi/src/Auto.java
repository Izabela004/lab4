public class Auto {

    float[] przebieg = new float[12];

    public Auto(){
        for(int i = 0; i<12; i++){
            przebieg[i] = (float)(Math.random()*101/10);
        }
    }
    float srPrzebieg(){
        float srednia = 0;
        for(int i = 0; i<12; i++){
            srednia += przebieg[i];
        }
        return srednia / 12;
    }
}
