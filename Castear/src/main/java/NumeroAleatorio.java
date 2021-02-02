/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        //int numeroAleatorio=(int)(Math.random()*25+1);
        //System.out.println(numeroAleatorio);
        int max=27; 
        int min=1;
        int i=0;
        int range=max-min+1; 
        while(i<1)
        {
            int rand=(int)(Math.random()*range)+min;
            System.out.println(rand);
            i++;
        }
    }
}
