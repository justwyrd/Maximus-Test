public class Main {
    public static void main(String[] args) {
        Npc test = new Npc("test", 10, 10);
        Npc blank = new Npc();
        Npc copy = (test);


        System.out.println(test);
        System.out.println(blank);
        System.out.println(copy);
    }


}
