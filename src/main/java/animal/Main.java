package animal;

public class Main {
    public static void main(String[] args) {
        //for each segment, initialize animal object and use invoke printAnimalSounds()
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
