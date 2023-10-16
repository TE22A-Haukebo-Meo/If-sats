import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        int x = 0;

        System.out.println("Vilket språk programmerar vi med?");
        String svar1 = tb.nextLine();
        if(svar1.equalsIgnoreCase("java"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng!");
        }    
        else{
            System.out.println("FEL! rätt svar va: Java");
            }
        
            tb.nextLine();
        System.out.println("Hur många ben har en kossa?");
        String svar1 = tb.nextLine();
        if(svar1.equalsIgnoreCase("Fyra"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng");
        }
        else{
            System.out.println("FEL! Rätt svar var: Fyra");
        }

            tb.nextLine();
        System.out.println("Har NTI bra skolmat?");
        String svar1 = tb.nextLine();
        if(svar1.equalsIgnoreCase("NEJ"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng");
        }
        else{
            System.out.println("FEL! Rätt svar va: NEJ");
        }

            tb.nextLine();
        System.out.println("Vem är the GOAT av fotboll?");
        String svar1 = tb.nextLine();
        if(svar1.equalsIgnoreCase("Messi"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng");
        }
        else if(svar1.equalsIgnoreCase("Ronaldo"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng");
        }
        else{
            System.out.println("FEL! Rätt svar var: Messi/Ronaldo");
        }

            tb.nextLine();
        System.out.println("Vem är the GOAT av f1?");
        String svar1 = tb.nextLine();
        if(svar1.equalsIgnoreCase("Hamilton"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng");
        }
        else if(svar1.equalsIgnoreCase("Lewis"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng");
        }
        else if(svar1.equalsIgnoreCase("Lewis Hamilton"))
        {
            System.out.println("Rätt! Du fick en poäng");
            x=x+1;
            System.out.println("Du har nu "+x+" poäng");
        }
        else{
            System.out.println("FEL! Rätt svar var:");
        }
        System.out.println("Där var frågesporten slut! Du fick "+x+" poäng! Bra Jobbat!");
    }
}
