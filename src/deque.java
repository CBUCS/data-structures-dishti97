import java.util.*;

class DequeExample implements ListInterface
{
    public static void main(String[] args)
    {


    }

    @Override
    public boolean add(Object item) {
        return false;
    }

    @Override
    public boolean addAt(Object item, int position) {
        return false;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public boolean removeAt(int position) {
        return false;
    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public int numItems() {
        return 0;
    }

    @Override
    public Object grabAt(int position) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void print() {

    }

    @Override
    public boolean clear() {
        return false;
    }
}




