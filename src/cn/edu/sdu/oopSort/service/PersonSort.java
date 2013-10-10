package cn.edu.sdu.oopSort.service;

import cn.edu.sdu.oopSort.bean.Person;
import cn.edu.sdu.oopSort.core.SortTools;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public interface PersonSort extends SortTools<Person> {

    public Person[] bubbleByHeight(Person[] source);
    public Person[] quickByHeight(Person[] source);
    public Person[] insertByHeight(Person[] source);

}
