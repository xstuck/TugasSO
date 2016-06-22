/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money.changer;

/**
 *
 * @author ASUS
 */
public class MoneyChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int Rupiah=200000;
        double dollar=Rupiah/5000;
        double yen=Rupiah/6000;
        double peso=Rupiah/70000;
        System.out.println(+dollar + "\tDollar ");
        System.out.println(+yen + "\t Yen ");
        System.out.println(+peso + "\t Peso ");
    }
    
}
