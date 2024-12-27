/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamodul2_tåg;
import java.util.Scanner;

public class JavaModul2_Tåg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int antal = 0; //säkerställer att antalet passagerare är noll från början
        boolean fortsätt = true; //deklarerar variabeln fortsätt som boolean sann
        
        /*presenterar menyn och låter användaren göra ett val inom en "do-while"
         *loop*/
        do {
            System.out.println("MENY");
            System.out.println("1. Nollställ antalet passagerare");
            System.out.println("2. Lägg till passagerare");
            System.out.println("3. Ta bort passagerare");
            System.out.println("4. Skriv ut antalet passagerare");
            System.out.println("5. Avsluta programmet");
            System.out.println("Vänligen gör ett val: ");
            int val = input.nextInt(); //läser in användarens val
            
            //en "switch" sats används för att hantera menyvalet 
            switch(val){
                
                //vid val 1 nollställs antalet passagerare
                case 1: 
                    antal = 0;
                    break;
                 
                /*vid val 2 ges användaren möjlighet att fylla i antal nya
                 *passagerare och adderar dessa till totala antalet*/       
                case 2:
                    System.out.println("Lägg till antalet nya passagerare: ");
                    int nya = input.nextInt();
                    antal = antal+nya;
                    break;
                
                /*vid val 3  ges användaren möjlighet att ta bort ett visst antal 
                 *passagerare och subtraherar dessa från totala antalet*/     
                case 3:
                    System.out.print("Hur många passagerare ska tas bort: ");
                    int bortfall = input.nextInt();
                    antal = antal-bortfall;
                    if (antal<0){
                        System.out.println("OBS - Antalet passagerare kan inte"
                                            +" vara negativt");
                        antal = antal+bortfall;/* återställer totala antalet
                                                * passagerare om summan blir negativ*/
                        break;}
                    break;
                 
                //vid val 4 skrivs antalet passagerare ut    
                case 4:
                    System.out.print("Antalet passagerare är nu: " +antal +" ");
                    break;
                
                //vid val 5 avslutas programmet    
                case 5:
                    fortsätt = false;
                    break;
                
                /*användaren får meddelande om att man har gjort ett val som inte
                 * finns i menyn*/   
                default:
                    System.out.println("Felinmatning.");
            }
        }
            while (fortsätt); /*programmet fortsätter tills användaren väljer
                               *att avsluta programmet*/
       }
}
        


                    
                    
            
        
        
    
    

