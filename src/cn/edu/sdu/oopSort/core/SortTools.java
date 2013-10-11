package cn.edu.sdu.oopSort.core;

import cn.edu.sdu.oopSort.exception.TargetArrayIsNullException;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public interface SortTools<T> {

    /* Bubble sort definition */
    public T[] bubbleDESC(T[] source) throws TargetArrayIsNullException;

    /* Quick sort definition */
    public T[] quickDESC(T[] source) throws TargetArrayIsNullException;

    /* Insert sort definition */
    public T[] insertDESC(T[] source) throws TargetArrayIsNullException;

    /* ------------------------------------------------------------------------ */
    // TODO: 作为拓展设计：我们可以着这里定义进行ASC的排序。
    /* ------------------------------------------------------------------------ */
}
