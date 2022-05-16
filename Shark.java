public class Shark{ //This class represents sharks in general, not all sharks are aggressive so there is no attack method
    private int size; //The size of the shark
    private int tagNumber; //The sharks tag number as in the tag scientists put on them to track
    private int bellyFullness = 0; //How full the shark is from eating
    public Shark(int s, int tag){
        size = s;
        tagNumber = tag;
    }
    public void eatFish(){
        if (bellyFullness < size*2){ //The bigger the sharks size the more fish it can eat before getting full
            
            bellyFullness++;
            System.out.println("Nom nom nom."); //Prints this if the shark successfully eats
        }
        else{
            System.out.println("You're too full!"); //Prints this if the shark does not eat a fish
        }
    }
    public void swim(){ //The for loop makes the shark swim until it runs out of food in its belly to fuel it
        for (int i = bellyFullness; i > 0; i--){
            bellyFullness--;
            System.out.println("You swim forward and burn energy.");
        }
        System.out.println("You're out of energy");
    }
    public void poop(){ //The shark poops out energy
        bellyFullness--;
        System.out.println("Your turd floats away...");

    }
    public void attackHuman(){
        if(size > 5){
        for(int i = bellyFullness; i > 0; i--){ //The shark uses all of its energy to attack different humans
            System.out.println("The shark uses some of its energy to attack a human.");
            }
        }
        else{
            System.out.println("This shark isn't big enough to attack humans!");
        }
    }
    public int getTagNumber(){ //Returns the tagNumber variable
        return tagNumber;
    }
    public void setTagNumber(int a){ //Changes the tagNumber variable
        tagNumber = a;
    }
    public int getSize(){ //Returns the size variable
        return size;
    }
    public void setSize(int b){// Changes the size variable
        size = b;
    }
}