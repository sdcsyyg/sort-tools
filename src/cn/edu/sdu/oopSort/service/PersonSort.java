package cn.edu.sdu.oopSort.service;

import cn.edu.sdu.oopSort.bean.Person;
import cn.edu.sdu.oopSort.core.SortTools;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public interface PersonSort extends SortTools<Person> {

    /* ------------------------------------------------------------------------ */
    // TODO: 作为拓展设计：我们可以在这里定义对person的别的比较准则，例如：
    // public Person[] bubbleByHeight(Person[] source) throws TargetArrayIsNullException;
    // public Person[] quickByHeight(Person[] source) throws TargetArrayIsNullException;
    // public Person[] insertByHeight(Person[] source) throws TargetArrayIsNullException;
    /* ------------------------------------------------------------------------ */

}
