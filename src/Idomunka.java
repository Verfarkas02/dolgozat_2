/*
* File: Idomunka.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-04-27
* Github: https://github.com/Verfarkas02/
* Licenc: GUI GPL Junit5
*/
import java.util.Scanner;

public class Idomunka {

    public Idomunka() {
    }
    private String beker(String msg){
        Scanner scanner =new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
   
    public void startIdomunka(){
        double munkaIdo=this.bekerData();
        nyomtat(munkaIdo);
    }
    public void nyomtat(double munkaIdo){
        System.out.println(munkaIdo);
    }
     private double bekerData(){
        String hosszStr =beker("Megmunkált hossz(mm): ");
        if(!this.checkInput(hosszStr)){
            System.err.println("!Hiba! Csak számot lehet beírni");
            throw new NumberFormatException();
        }
        String elotolasStr =beker("Fordulatonkénti előtolás: ");
        if(!this.checkInput(elotolasStr)){
            System.err.println("!Hiba! Csak számot lehet beírni");
            throw new NumberFormatException();
        }
        String fordulaszamStr =beker("Főorsó fordulatszám(fordulatszám percenként): ");
        if(!this.checkInput(fordulaszamStr)){
            System.err.println("!Hiba! Csak számot lehet beírni");
            throw new NumberFormatException();
        }
        
        double hossz =Double.parseDouble(hosszStr);
        double elotolas =Double.parseDouble(elotolasStr);
        double fordulatszam =Double.parseDouble(fordulaszamStr);
        double munkaIdo =this.szamitMunka(hossz, elotolas, fordulatszam);
        return munkaIdo;
    }
    public double szamitMunka(double hossz, double elotolas, double fordulatszam){
        double munkaIdo =hossz/(elotolas * fordulatszam);
        return munkaIdo;
    }
    public boolean checkInput(String input){
        if(input.matches("[0-9.]+")){
            return true;
        }else{
            return false;
        }
    }
}
