
package bangunruang;

public class Bola extends BangunRuang {
    
    double r;
    
    @Override
    double volume (){
    
        double VolumeBola = (Math.PI * r * r * r * 4/3);
        System.out.println("Hasil dari volume bola adalah " + VolumeBola);
        
        return VolumeBola;          
    }
}
