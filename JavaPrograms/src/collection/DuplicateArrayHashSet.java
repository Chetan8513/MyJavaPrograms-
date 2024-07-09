package collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayHashSet {

    private static DuplicateArrayHashSet instance;

    private DuplicateArrayHashSet() {}

    public static DuplicateArrayHashSet getInstance() {
        if (instance == null) {
            instance = new DuplicateArrayHashSet();
        }
        return instance;
    }
}

class Test {

    public static void main(String[] args) {

        DuplicateArrayHashSet singleton1 = DuplicateArrayHashSet.getInstance();
        DuplicateArrayHashSet singleton2 = DuplicateArrayHashSet.getInstance();

        // Verify that both references point to the same instance
        System.out.println(singleton1 == singleton2); // Should print true
    }
}
