
class MainRunner{
    public static void main(String args[]) //Tests each method of the class at least once
    {
        Shark Gerry = new Shark(1,2);
        Gerry.eatFish();
        Gerry.swim();
        Gerry.poop();
        Gerry.setSize(4);
        Gerry.getSize();
        Gerry.setTagNumber(2);
        Gerry.getTagNumber();
        Gerry.eatFish();   
        Gerry.attackHuman();

    }
}