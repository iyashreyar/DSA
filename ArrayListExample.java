import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> var1 = new ArrayList<>();
        var1.add(34);
        var1.add(4);
        var1.add(54);
        var1.add(76);
        var1.add(84);
        var1.add(93);
        var1.add(43);
        var1.add(26);

        System.out.println(var1.contains(84));
        var1.set(0, 3);
        var1.remove(3);
        System.out.println(var1);
    }
}
