package cn.edu.sdu.oopSort.core;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public interface SortTools<T> {

    /* Bubble sort definition */
    public T[] bubbleDESC(T[] source);

    /* Quick sort definition */
    public T[] quickDESC(T[] source);

    /* Insert sort definition */
    public T[] insertDESC(T[] source);

    /* ------------------------------------------------------------------------ */
    // TODO: We can define sort methods here for asc or some other greater design.
    /* ------------------------------------------------------------------------ */
}
