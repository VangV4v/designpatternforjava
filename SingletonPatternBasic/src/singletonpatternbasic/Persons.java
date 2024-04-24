/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpatternbasic;

public class Persons {
    private String name;
    private String age;
    
    private static Persons instance = new Persons();
    
    private Persons() {
        
    }
    
    public static Persons getInstance() {
        return instance;
    }
    
    public void initData(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" + "name=" + name + ", age=" + age + '}';
    }
}