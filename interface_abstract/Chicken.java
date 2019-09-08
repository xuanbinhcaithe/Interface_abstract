package interface_abstract;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}