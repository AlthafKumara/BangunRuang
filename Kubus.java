
package bangunruang;

public class Kubus extends BangunRuang{
    
    double s;
    
    @Override
    double volume (){
    
        double VolumeKubus = (s*s*s);
        System.out.println("Hasil dari Volume Kubus adalah = " + VolumeKubus);  
        return VolumeKubus;
    }
}
