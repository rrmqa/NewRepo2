package day03;

public class Children {
    public static void main(StringPractice[] args) {


        Blueprint child1 = new Blueprint();
        child1.setInfo("Ali", 3);
        System.out.println(child1);
        child1.gift();
        System.out.println("=======================================");
        Blueprint child2 = new Blueprint();
        child2.setInfo("Dilshod", 6);
        System.out.println(child2);
        System.out.println("=======================================");
        Blueprint child3 = new Blueprint();
        child3.setInfo("Kamol", 10);
        System.out.println(child3);
        child3.gift();
        System.out.println("=======================================");
        Blueprint child4 = new Blueprint();
        child4.setInfo("Muhtar", 1);
        System.out.println(child4);
        System.out.println("=======================================");
        Blueprint child5 = new Blueprint();
        System.out.println(child5);

    }
}
