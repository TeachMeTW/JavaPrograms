package BabyObject;
import java.util.Date;

public class Baby {
    // Baby variables (string)
    // misc baby details
    String name;
    String race = "[race info not provided]";
    String hairColor= "[hair color info not provided]";
    String eyeColor = "[eye color info not provided]";
    String status = "Alive";

    // Baby variables (int)
    // age and other numerical based info
    int age ;
    private int peeCount;
    private int pooCount;
    private int vomitCount;

    // Baby variables (bool)
    // checks status
    boolean isClean = true;
    boolean isHungry = false;


    // Constructors 

    // Just baby name constructor -- pass in a name
    public Baby(String name) {
        this.name = name;
    }

    // Baby constructor with name and age
    public Baby(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Baby constructor with all variables
    public Baby(String name, int age, String race, String hairColor, String eyeColor) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    // Basic operator/function overload
    // Prints out all the details of the baby
    public String toString() {
        return("Currently " + status+ " \nHi my name is " + getBabyName() + ".\nI am " + getBabyRace() + ".\nMy eye color is "
        + getEyeColor() + ".\nMy hair color is " + getHairColor() + ".\nI am " + getAge() +" years old"
        + "\nI pooped " + getPooCount() + " times and I pee'd " + getPeeCount() + " times and I vomited " + getVomitCount() + " times");
    }

    // returns baby name
    // Accessor
    public String getBabyName() {
        return name;
    }
    // returns race
    // Accessor
    public String getBabyRace() {
        return race;
    }
    // returns hair color
    // Accessor
    public String getHairColor() {
        return hairColor;
    }
    // returns eye color
    // Accessor
    public String getEyeColor() {
        return eyeColor;
    }
    // returns the baby status
    // Accessor
    public void getBabyStatus() {
        System.out.println("Baby Status: " + status);
        System.out.println("Clean: " + isClean);
        System.out.println("Hungry: " + isHungry);
    }
    // return baby age
    // Accessor
    public int getAge() {
        return age;
    }
    // return baby pee count
    // Accessor
    public int getPeeCount() {
        return peeCount;
    }
    // return poo count
    // Accessor
    public int getPooCount() {
        return pooCount;
    }
    // return vomit count
    // Accessor
    public int getVomitCount() {
        return vomitCount;
    }
    // feeds baby
    // Mutator
    public void feedBaby() {
        isHungry = false;
    }
    // cleans baby
    // Mutator
    public void cleanBaby() {
        isClean = true;
        
    }
    // peeing action
    // Mutator
    public void isPeeing() {
        isClean = false;
        peeCount++;
    }
    // pooping action
    // Mutator
    public void isPooping() {
        isClean = false;
        pooCount++;
    }

    // vomit action
    // Mutator
    public void isVomiting() {
        isClean = false;
        isHungry = true;
        vomitCount++;
    }
    
    // dying action
    // Mutator
    public void died() {
        status = "Deceased";
        Date date = new Date();
        System.out.println("Death date: " + date);
    }
}
