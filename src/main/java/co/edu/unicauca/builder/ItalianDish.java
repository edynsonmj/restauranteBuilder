/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.builder;

/**
 * representa la creacion de un plato italiano
 * @author Camilo Gonzalez, edynson muñoz jimenez
 */
public class ItalianDish extends Dish {
    
    private String italianName;
/**
 * constructor parametrizado
 * @param name nombre del plato
 * @param description descripcion del pplato
 * @param image "imagen del plato" es una descripcion
 * @param price precio del plato
 * @param size tamaño del plato
 * @param paisOrigen 
 */
    public ItalianDish(String name, String description, String image, int price, EnumSize size, String paisOrigen) {
        super(name, description, image, price, size);
        this.italianName = paisOrigen;
    }

    public String getPaisOrigen() {
        return italianName;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.italianName = paisOrigen;
    }

}
