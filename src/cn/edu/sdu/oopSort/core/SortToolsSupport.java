package cn.edu.sdu.oopSort.core;

import cn.edu.sdu.oopSort.exception.TargetArrayIsNullException;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public abstract class SortToolsSupport<T> implements SortTools<T> {

    @Override
    public T[] bubbleDESC(T[] source) throws TargetArrayIsNullException {
        if(source==null || source.length<1) {
            throw new TargetArrayIsNullException(" -- Tartget array can not be null or empty! --");
        }
        for(int i=0; i<source.length-1; i++) {
            for(int j=i+1; j<source.length; j++) {
                if(firstBigger(source[j], source[i])) {
                    T tmp = source[i];
                    source[i] = source[j];
                    source[j] = tmp;
                }
            }
        }
        return source;
    }

    @Override
    public T[] quickDESC(T[] source) throws TargetArrayIsNullException {
        if(source==null || source.length<1) {
            throw new TargetArrayIsNullException(" -- Tartget array can not be null or empty! --");
        }
        // TODO 在此处实现快排
        return null;
    }

    @Override
    public T[] insertDESC(T[] source) throws TargetArrayIsNullException {
        if(source==null || source.length<1) {
            throw new TargetArrayIsNullException(" -- Tartget array can not be null or empty! --");
        }
        // TODO 在此处实现插排
        return null;
    }

    /**
     * Judge if the first bigger than the second
     * @param first : the first one
     * @param second : the second one
     * @return
     */
    private boolean firstBigger(T first, T second) {
        if(first.getClass().getSuperclass() == Number.class) {
            Number normalNum4First = (Number)first;
            Number normalNum4Second = (Number)second;
            if(normalNum4First.doubleValue() > normalNum4Second.doubleValue()) {
                return true;
            }
        }
        if(first.getClass() == String.class) {
            // TODO : 找一个好的办法去比较两个String
            if(first.hashCode() > second.hashCode()) {
                return true;
            }
        }
        return false;
    }

}
