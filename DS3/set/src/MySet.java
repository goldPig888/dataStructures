import java.util.Iterator;
import java.util.ArrayList;
public class MySet<T> implements SetInterface<T> {

    private ArrayList<T> set = new ArrayList<T>();
    Iterator<T> iterator = set.iterator();

    public MySet(){
        set = new ArrayList<T>();
    }

    @Override
    public boolean add(T o){
        if(set.contains(o)){
            return false;
        }
        set.add(o);
        return true;
    }

    @Override
    public void clear(){
        set.clear();
    }

    @Override
    public boolean contains(T o){
        return set.contains(o);
    }

    @Override
    public boolean isEmpty(){
        return set.isEmpty();

    }

    @Override
    public Iterator<T> iterator(){
        return iterator;
    }

    @Override
    public boolean remove(T o){
        if(set.contains(o)){
            set.remove(o);
            return true;
        }
        return false;
        
    }
    
    @Override
    public int size(){
        return set.size();
    }



}
