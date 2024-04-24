/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package builderpattern;

/**
 *
 * @author vangv
 */
public interface BikeBuilder {
    
    BikeBuilder setName(String name);
    
    BikeBuilder setType(String type);
    
    BikeBuilder setPrice(String price);
    
    Bikes build();
    
}