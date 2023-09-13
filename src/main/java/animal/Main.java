package animal;

public class Main {
    public static void main(String[] args) {
        String[] catNicknames = {"Tom", "Whiskers", "Leo"};
        Animal cat = new Animal('c',3,catNicknames, "meoww");
        cat.printAnimalSounds();

        String[] dogNicknames = {"Buddy","Coco","Olive"};
        Animal dog = new Animal('d', 5, dogNicknames, "barkk");
        dog.printAnimalSounds();

        String[] tortoiseNicknames = {"Blastoise", "Speedy", "Shelldon"};
        Animal tortoise = new Animal('t', 30, tortoiseNicknames, "...hisss");
        tortoise.printAnimalSounds();

        //print out all the nicknames of each animal using object method.
        cat.printNicknames();
        dog.printNicknames();
        tortoise.printNicknames();
    }

}
/*
        Start a new Java project (select maven)
        Create an Animal class inside a package
        Declare (give) inside the class three properties(instance variables) of three different data types but one of the instance variables MUST be an array
        Create a method named printAnimalSound() that that can be used to print out the sound each Animal that you create makes. Eg: dogs..  Woof woof and cats meow meow :cat:
        Inside the same package, create a class that has a main method so that we can run our code
        create 3 different type of Animals (objects)  of your choice inside the main method
        Pass values to each property for each object (animal)
        Call or invoke the printAnimalSound on each animal object (instance / reference variable )
Now create another method inside the Animal class (yes, you can have multiple methods ). Make the second method print out the values of each of element in the array. Eg: if my array property is named animalNickNames… then when I invoke the the second method printAnimalNicknames() method on..say a cat object then it should print all the elements (cat’s nicknames) for the object in question.
Push code to github and Dm link to me

questions I need to ask tmr: can we have more than 3 instance variables as long as there are 3 different data types?

!!instead of nickname array, I can do weight (decide if lbs or kg) as a double array. That way, I can remove the String[] nicknames and have 3 instance fields of int, String, and double.
 */