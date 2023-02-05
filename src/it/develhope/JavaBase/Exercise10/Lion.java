package it.develhope.JavaBase.Exercise10;

public class Lion extends Animal{
    public Lion(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("The sound of the lion is Roaaaarrrrr");
    }
}
