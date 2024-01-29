/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;


public class Tabung extends BangunRuang{

 double r;
 double t;
 
 @Override
         double volume(){
         
             double VolumeTabung = (Math.PI * r * r * t);
             System.out.println("Volume dari tabung adalah = " + VolumeTabung);
             return VolumeTabung;
         }
         
}
