
package bangunruang;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner MyObj = new Scanner(System.in);
        
        System.out.println("Calculator Volume");
        
        System.out.print("Masukkan Rumus yang ingin dihitung = ");
        String rumus;
        rumus = MyObj.nextLine();
        
        switch (rumus){
        
            case "Kubus":
                
                Kubus kubus = new Kubus();
                System.out.println("Rumus Kubus adalah = S*S*S");
                
                System.out.print("Masukkan nilai rusuk : ");
                double rusuk = MyObj.nextDouble();
                
                kubus.s = rusuk;
                kubus.volume();
                
                break;
                
            case "Tabung":
                Tabung tabung = new Tabung();
                System.out.println("Rumus dari tabung adalah = phi * r * r * t");
                
                System.out.print("Masukkan nilai jari jari = ");
                double jari = MyObj.nextDouble();
                
                System.out.print("Masukkan nilai tinggi = ");
                double tinggi = MyObj.nextDouble();
                
                tabung.r = jari;
                tabung.t = tinggi;
                tabung.volume();
                
                break;
                
            case "Bola":
                Bola bola = new Bola();
                System.out.println("Rumus dari bola adalah = phi *4/3 * r * r * r");
                
                System.out.print("Masukkan nilai Jari jari = ");
                double Jari = MyObj.nextDouble();
                
                bola.r = Jari;
                bola.volume();
                
                break;
                
            case "Limas Segitiga":
                LimasSegitiga LS = new LimasSegitiga();
                System.out.println("Rumus dari limas segitiga adalah = 1/3 * la * t");
                
                System.out.print ("Masukkan nilai Luas Alas = ");
                double la = MyObj.nextDouble();
                
                System.out.print("Masukkan nilai dari Tinggi = ");
                double t = MyObj.nextDouble();
                
                LS.la = la;
                LS.t = t;
                LS.volume();
                
                break;
                default:
                    System.out.println("Rumus tidak ada dalam database");
                
        } 
        
        
    }
    
}
