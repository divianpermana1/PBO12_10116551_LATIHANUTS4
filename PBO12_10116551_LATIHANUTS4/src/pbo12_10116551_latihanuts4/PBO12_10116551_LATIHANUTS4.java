/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116551_latihanuts4;

/**
 *
 * @author CP321
 */
public class PBO12_10116551_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelDesigner oMd=new ModelDesigner();
        oMd.bonusDesigner(40000);
        
        ModelProgrammer oMp=new ModelProgrammer();
        oMp.bonusProgrammer(40000);
        
        ModelSystemAnalyst oMsa=new ModelSystemAnalyst();
        oMsa.bonusSystemAnalyst(40000);
    }
    
}
