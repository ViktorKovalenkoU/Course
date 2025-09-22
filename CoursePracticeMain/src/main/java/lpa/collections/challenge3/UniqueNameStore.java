package lpa.collections.challenge3;

import java.util.*;

public class UniqueNameStore {
    private final Set<String> set;
    public UniqueNameStore(boolean sorted) {
        if (sorted) {
            this.set = new TreeSet<>();
        } else {
            this.set = new LinkedHashSet<>();
        }
    }

    public boolean addName(String name) {
       return set.add(name);
    }
    public boolean removeName(String name) {
        return set.remove(name);
    }
    public boolean contains(String name) {
        return set.contains(name);
    }
    public List<String> listAll() {
        return new ArrayList<>(set);
    }
    public List<String> listReverse(){
        List<String> res = new ArrayList<>(set);
        Collections.reverse(res);
        return res;
    }
    public void clear() {
        set.clear();
    }
}
