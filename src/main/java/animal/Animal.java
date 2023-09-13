package animal;

public class Animal {
    public char initial;
    public int age;
    public String[] nicknames;
    public String sound;

    public Animal(char initial, int age, String[] nicknames, String sound){
        this.initial = initial;
        this.age = age;
        this.nicknames = nicknames;
        this.sound = sound;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNicknames(String[] nicknames) {
        this.nicknames = nicknames;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void printAnimalSounds() {
        for (int i = 0; i < 3; i++) {
            System.out.print(sound + " ");
        }
        System.out.println();
    }

    public void printNicknames() {
        for (String names: this.nicknames) {
            System.out.print(names + " ");
        }
        System.out.println();
    }
}
