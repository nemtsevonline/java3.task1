public class Main {
    public static void main(String []args) {
        int costTikets = 1000;
        int bonusMiles;
        if (costTikets >= 20) {
            bonusMiles = costTikets / 20;
        } else{
            bonusMiles = 0;
    }
        System.out.println(bonusMiles);
    }}

