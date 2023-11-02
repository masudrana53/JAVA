/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylist;

import java.util.Objects;

/**
 *
 * @author user
 */
public abstract class MyAbstractList <E> implements IMyList<E>{
    protected int size = 0;

    public MyAbstractList() {
    }

    protected MyAbstractList (E [] objects){
        for (E object : objects) {
            add(object);
        }
    }
}
