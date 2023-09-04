/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mylist;

/**
 *
 * @author user
 */
public interface IMyList <E> extends Iterable<E> {
    public  void add(E e);
    public void add(int index, E e);
    public void clear();
    public boolean contains(E e);
    public E get(int index);
    public int indexOf(E e);
    public boolean isEmpty();
    public int lastIndexOf(E e);
    public boolean remove(E e);
    public E remove(int index);
    public Object set(int index, E e);
    public int size();
    
    
    
}
