package charpter8;

public class test2 {
    public static void main(String[] args){
        Character character1 = new Character('Z');
        Character character2 = new Character('z');
        System.out.println(character1.equals(character2));

        Character.toLowerCase(character1);
        Character.toUpperCase(character2);
        System.out.println(character1.equals(character2));

    }
}
