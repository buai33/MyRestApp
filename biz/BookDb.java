/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mcgill.cccs425.biz;

import java.util.concurrent.ConcurrentHashMap;


/**
 *
 * @author xwliu
 */
public class BookDb {
     private ConcurrentHashMap books;
    
    public BookDb() {
        books = new ConcurrentHashMap();
    }
    
    public Book find(long id) {
        if(books.containsKey(id))
            books.get(id);
        return null;
    }
    
    public long add(String title) {
        long id = books.size() + 1; // TODO: use singleton counter as in the prediction class
        Book b = new Book(id, title);
        books.put(id, title);
        return id;
    }
    
    // implement the rest
    
    
    
}
