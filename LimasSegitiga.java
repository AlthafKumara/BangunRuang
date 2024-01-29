/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

public class LimasSegitiga extends BangunRuang {

    double la ; 
    double t;
    
    @Override
        double volume(){   
                double VolumeLimas = (1/3 * la * t );
                System.out.println("hasil dari volume limas adalah " + VolumeLimas);
                
                return VolumeLimas;
        
        }
}
