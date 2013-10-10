package cn.edu.sdu.oopSort.service;

import cn.edu.sdu.oopSort.bean.Person;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class PersonSortImpl implements PersonSort {

    /* The singleton instance */
    private static PersonSortImpl sortTool4Person = new PersonSortImpl();

    private PersonSortImpl() {}

    public static PersonSortImpl getInstance() {
        return sortTool4Person;
    }

    @Override
    public Person[] bubbleDESC(Person[] source) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person[] quickDESC(Person[] source) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person[] insertDESC(Person[] source) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** Sorting by height that is a to do thing **/
    
    @Override
    public Person[] bubbleByHeight(Person[] source) {
        // TODO Bubble sort by person's height
        return null;
    }

    @Override
    public Person[] quickByHeight(Person[] source) {
        // TODO quick sort by person's height
        return null;
    }

    @Override
    public Person[] insertByHeight(Person[] source) {
        // TODO insert sort by person's height
        return null;
    }

}
