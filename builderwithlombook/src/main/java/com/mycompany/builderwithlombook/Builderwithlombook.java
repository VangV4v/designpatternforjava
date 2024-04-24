/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builderwithlombook;

/**
 *
 * @author vangv
 */
public class Builderwithlombook {

    public static void main(String[] args) {
        Classes Class12c7 = Classes.builder().name("12C7").floor("The Sec").members("41").build();
        Classes AfterClass12c7 = Classes.builder().name("12C7 in Future").floor("The ...").build();
        System.out.println(Class12c7.toString());
        System.out.println(AfterClass12c7.toString());
    }
}
