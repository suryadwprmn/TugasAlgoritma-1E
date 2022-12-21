import java.util.ArrayList;

public class BisKota {
    public static void main(String[] args) {
        ArrayList <int []> StopGo = new ArrayList<int[]>();
        //array pertama orang naik bus, array kedua orang turun
        StopGo.add(new int[] {10,0});
        StopGo.add(new int[] {3,5});
        StopGo.add(new int[] {2,5});
        System.out.println(getPassenger(StopGo));
    }
    public static int getPassenger(ArrayList <int []> bisKota){
        return (bisKota.get(0)[0]- bisKota.get(0)[1] ) +(bisKota.get(1)[0] -bisKota.get(1)[1]) + (bisKota.get(2)[0] -bisKota.get(2)[1]);
    }
}
