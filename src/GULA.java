import java.util.Scanner;

public class GULA 
     {
        public  void startCalc(){
            Scanner sc = new Scanner(System.in);
            
            System.out.print("oldal:");
            String sideStr = sc.nextLine();
            Double side = Double.parseDouble(sideStr);
    
            System.out.print("magasság: ");
            String heighStr = sc.nextLine();
            Double height = Double.parseDouble(heighStr);
    
            Double volume = 1.0/3.0*Math.pow(side, 2)*height;
    
            System.out.printf("Térfogat: %f\n",volume);
    
            sc.close();
        }
    
}
