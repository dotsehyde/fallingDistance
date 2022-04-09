
package fallingdistance;


public class FallingDistance {

    
    public static void main(String[] args) {
        //Loop from 1 to 10
        for(double i=1; i<11;i++){
          double distance= fallingDistance(i);
          //I parse the double into an integer
          System.out.println("Time: "+(int)i+"s: The distance is = "+ (int)distance+"m");
        }
    }
    
    //Method/function to calculate distance
    public static double fallingDistance(double time){
        double g = 9.8;
        double distance = 0.5 * g *  (time*time);
        return distance;
    }
    
}
