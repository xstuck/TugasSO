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

    int Rupiah=100000;
        double dollar=Rupiah/4250;
        double yen=Rupiah/6000;
        double peso=Rupiah/2950;
        System.out.println(+dollar + "\tDollar ");
        System.out.println(+yen + "\t Yen ");
        System.out.println(+peso + "\t Peso ");
    }
    
}
