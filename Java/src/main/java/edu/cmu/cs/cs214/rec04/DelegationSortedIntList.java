package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    private int totalAdded = 0;
    private SortedIntList list = new SortedIntList();

    public DelegationSortedIntList() {
    }

    // Increment the totalAdded count by 1 and reuses the add method from the
    // SortedIntList class
    public boolean add(int num) {
        totalAdded++;
        return this.list.add(num);
    }

    // Increment the totalAdded count by the size of the list being added and reuses
    // the addAll method from the SortedIntList class
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return this.list.addAll(list);
    }

    // Accessor for the totalAdded count
    public int getTotalAdded() {
        return totalAdded;
    }

    // Reuses the get method from the SortedIntList class
    public int get(int index) {
        return this.list.get(index);
    }

    // Reuses the remove method from the SortedIntList class
    public boolean remove(int num) {
        return this.list.remove(num);
    }

    // Reuses the removeAll method from the SortedIntList class
    public boolean removeAll(IntegerList list) {
        return this.list.removeAll(list);
    }

    // Reuses the size method from the SortedIntList class
    public int size() {
        return this.list.size();
    }
}