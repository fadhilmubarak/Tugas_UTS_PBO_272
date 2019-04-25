/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_uts_pbo;

/**
 *
 * @author salma
 */
public class RakitPC {
    public static void main(String[]args){
        Intel intel1 = new Intel(2);
        AMD amd1 = new AMD (2);
        Komputer komputer 1 = new Komputer(intel1);
        
        komputer1.cetakInfo();
        komputer1.memasang(intel1);
        komputer1.mencabut(amd1);
        komputer1.cetakInfo();
    }
}
