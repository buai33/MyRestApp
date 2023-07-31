/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mcgill.cccs425.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author xwliu
 */
@XmlRootElement
public class Book implements Serializable{
    private Long id;
    private String title;
    
    public Book(){}
    
    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }
    
    public Long getId(){ 
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    
    @Override
    public String toString(){
        return "Book[ " + id + ",\"" + title + "\"]";
    }
   
    
}
