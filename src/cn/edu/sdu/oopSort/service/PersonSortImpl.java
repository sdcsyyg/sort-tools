package cn.edu.sdu.oopSort.service;

import cn.edu.sdu.oopSort.bean.Person;
import cn.edu.sdu.oopSort.exception.TargetArrayIsNullException;

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
    public Person[] bubbleDESC(Person[] source) throws TargetArrayIsNullException {
        if(source==null || source.length<1) {
            throw new TargetArrayIsNullException(" -- Tartget array can not be null or empty! --");
        }
        for(int i=0; i<source.length-1; i++) {
            for(int j=i+1; j<source.length; j++) {
                if(source[j].older(source[i])) {
                    Person tmp = source[i];
                    source[i] = source[j];
                    source[j] = tmp;
                }
            }
        }
        return source;
    }

    @Override
    public Person[] quickDESC(Person[] source) throws TargetArrayIsNullException {
        // TODO 在此处实现快排
        return source;
    }

    @Override
    public Person[] insertDESC(Person[] source) throws TargetArrayIsNullException {
        // TODO 在此处实现插排
        return null;
    }

}
