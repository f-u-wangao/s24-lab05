package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0;

    public InheritanceSortedIntList() {
    }

    // Overriding the add method to increment the totalAdded count by 1
    public boolean add(int value) {
        totalAdded++;
        return super.add(value);
    }

    // Keep original addAll method as add method is called in addAll to ensure
    // totalAdded is incremented
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    // Accessor for the totalAdded count
    public int getTotalAdded() {
        return totalAdded;
    }
}