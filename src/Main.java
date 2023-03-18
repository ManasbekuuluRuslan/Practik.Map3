import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> name = new HashSet<>();
        name.add("USE");
        name.add("Russia");
        name.add("Kyrgyzstan");
        System.out.println(name);

        HashSet<Integer> out = new HashSet<>();
        out.add(1);
        out.add(2);
        out.add(3);
        out.add(4);
        System.out.println("элементтердин саны: "+out.size());

        HashSet<Integer> clear = new HashSet<>();
        clear.add(213);
        clear.add(9876);
        clear.add(3445);
        clear.clear();
        System.out.println("HashSet топтому бошотулду");

        HashSet<Integer> search = new HashSet<>();

        if(search.isEmpty()){
            System.out.println("HashSet топтому бош");
        }else{
            System.out.println("HashSet топтому бош эмес");
        }

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(5);
        treeSet.addAll(hashSet);
        System.out.println("Hash set: "+hashSet);
        System.out.println("Tree set: "+treeSet);

        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("MERCEDES-BENZ");
        cars.add("TOYOTA");

        HashSet<String> colors = new HashSet<>(cars);
        colors.add("Black");
        colors.add("White");
        colors.add("Blue");
        System.out.println("LinkedList: "+cars);
        System.out.println("HashSt: "+colors);

        HashSet<String> players = new HashSet<>();
        players.add("Ronaldo");
        players.add("Messi");
        players.add("Mbappe");
        players.add("Neymar");

        HashSet<String> players2 = new HashSet<>();
        players2.add("Kane");
        players2.add("Benzema");
        players2.add("Ronaldo");
        players2.add("Mbappe");

        HashSet<String> salyshtyruu = new HashSet<>(players);
        salyshtyruu.retainAll(players2);

        System.out.println("Players 1: "+players);
        System.out.println("Players 2: "+players2);
        System.out.println("Окшош players: "+salyshtyruu);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Apple");
        hashSet1.add("Banana");
        hashSet1.add("Cucumber");

        String[] massive = new String[hashSet1.size()];
        hashSet1.toArray(massive);
        System.out.println("Hash Set: "+hashSet1);
        for (String a: massive) {
            System.out.println("Array: "+a);
        }


        /*      1. HashSet тизмедеги бардык элементтерди алуу үчүн Java программасын жазыңыз.
        2. HashSet топтомундагы элементтердин санын алуу үчүн Java  программасын жазыңыз.
        3. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.
        4. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
        5. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.
        6.  LinkedList  тин  маанилерин  HashSet  ге  кочуруп  алуу  учун  программа жазыныз.
        7. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.
        8. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.*/


        //  NEVER  LOOK BACK !!!  ТЫ СМОЖЕШЬ АУФ!!
    }
}