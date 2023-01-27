import java.util.ArrayList;


abstract class MyConstraints implements Stringify, Save {

}

public class Vector<T extends MyConstraints> implements Stringify {

    private ArrayList<T> storage;
    Vector() {
        storage = new ArrayList<T>();
    }

    Vector(int minCapacity) {
        storage = new ArrayList<T>(minCapacity);
    }

    int size() {
        return storage.size();
    }

    T at(int idx) {
        return storage.get(idx);
    }

    void add(T el) {
        storage.add(el);
    }


    @Override
    public String asString() {
        String res = "[";
        for(T el : storage) {
            res += el.asString() + ", ";
        }
        res += "]";
        return res;
    }
}
