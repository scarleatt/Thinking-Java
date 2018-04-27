import java.util.*;

import net.mindview.util.TextFile;
import typeinfo.pets.*;

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Brarburn extends Apple {}

class SimpleCollection {
    SimpleCollection() {
        Collection<Integer> c=new ArrayList<Integer>();
        for (int i=0;i<10;i++)
            ((ArrayList<Integer>) c).add(i);
        for (Integer i: c)
            System.out.println(i);;
    }
}

class PrintContainers {
    public Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    public Map fill(Map<String,String> map) {
        map.put("rat","Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }
}

class SimpleIteration {
    SimpleIteration() {
        List<Pet> pets=Pets.arrayList(12);
        Iterator<Pet> it=pets.iterator();
        while (it.hasNext()) {
            Pet p=it.next();
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
        for (Pet p: pets)
            System.out.print(p.id()+":"+p+" ");
        System.out.println();
        it=pets.iterator();
        for (int i=0;i<6;i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}

class CrossContainerIteration {
    private static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p=it.next();
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
    }
    CrossContainerIteration() {
        ArrayList<Pet> pets=Pets.arrayList(8);
        LinkedList<Pet> petsLL=new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS=new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS=new TreeSet<Pet>(pets);
        this.display(pets.iterator());
        this.display(petsLL.iterator());
        this.display(petsHS.iterator());
        this.display(petsTS.iterator());
    }
}

class ListIteration {
    ListIteration() {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        }
        System.out.println();
        while (it.hasPrevious())
            System.out.print(it.previous().id()+" ");
        System.out.println();
        System.out.println(pets);
        it=pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}

class ListInteger {
    ListInteger() {
        List<Integer> a=new ArrayList<Integer>(8);
        List<Integer> b=new ArrayList<Integer>(8);
        for (int i=0;i<8;i++)
            a.add(i);
        ListIterator<Integer> it=a.listIterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();
        while (it.hasPrevious()) {
            b.add(it.previous());
        }
        for (Integer i: b)
            System.out.print(i+" ");
    }
}

class StackTest {
    StackTest() {
        Stack<String> stack=new Stack<String>();
        for (String s: "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop()+" ");
    }
}

class SetOfInteger {
    SetOfInteger() {
        Random rand=new Random(47);
        Set<Integer> inset=new HashSet<Integer>();
        for (int i=0;i<10000;i++)
            inset.add(rand.nextInt(30));
        System.out.println(inset);

        SortedSet<Integer> intset=new TreeSet<Integer>();
        for (int i=0;i<10000;i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}

class UniqueWordsAlhpabetic {
    UniqueWordsAlhpabetic() {
        Set<String> words=
                new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(
                new TextFile("Main.java", "\\W+"));
        System.out.println(words);
    }
}

class Statistics{
    Statistics() {
        Random rand=new Random(47);
        Map<Integer,Integer> m=new HashMap<Integer, Integer>();
        for (int i=0;i<1000;i++) {
            int r=rand.nextInt(20);
            Integer freq=m.get(r);
            m.put(r, freq==null?1:freq+1);
        }
        System.out.println(m);
    }
}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        Statistics s=new Statistics();

//        UniqueWordsAlhpabetic u=new UniqueWordsAlhpabetic();

//        SetOfInteger s=new SetOfInteger();

//        StackTest s=new StackTest();

//        ListInteger l=new ListInteger();

//    ListIteration it=new ListIteration();

//        CrossContainerIteration c=new CrossContainerIteration();

//        ArrayList<Apple> apples=new ArrayList<Apple>();
//        apples.add(new GrannySmith());
//        apples.add(new Gala());
//        apples.add(new Fuji());
//        apples.add(new Brarburn());
//        for (Apple c: apples)
//            System.out.println(c);
//
//        SimpleCollection c=new SimpleCollection();

//        PrintContainers p=new PrintContainers();
//        System.out.println(p.fill(new ArrayList<String>()));
//        System.out.println(p.fill(new LinkedList<String>()));
//        System.out.println(p.fill(new HashSet<String>()));
//        System.out.println(p.fill(new TreeSet<String>()));
//        System.out.println(p.fill(new LinkedHashSet<String>()));
//        System.out.println(p.fill(new HashMap<String, String>()));
//        System.out.println(p.fill(new TreeMap<String, String>()));
//        System.out.println(p.fill(new LinkedHashMap<String, String>()));

//        SimpleIteration simple=new SimpleIteration();
    }
}
