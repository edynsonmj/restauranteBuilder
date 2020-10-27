package co.edu.unicauca.builder;

/**
 * Builder concreto
 *
 * @author Libardo, Julio
 */
public class OrientalDishBuilder extends DishBuilder {

    @Override
    public void setCore() {
        OrientalDish dh = new OrientalDish("Arroz oriental", "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas", "", 56000, EnumSize.ALL, "East rice");
        this.setDish(dh);
        //this.setDish(new OrientalDish("Arroz oriental", "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas", "", 56000, EnumSize.ALL, "East rice"));
        
    }

    @Override
    public void addParts() {
        Dish mainDish = this.getDish();
        Dish dh1 = new Dish("torta piña", "Torta de piña como entrada", "", 3000, EnumSize.ALL);
        mainDish.addPart(dh1);
        //this.getDish().addPart(new Dish("torta piña", "Torta de piña como entrada", "", 3000, EnumSize.ALL));
        Dish dh2 = new Dish("Coffee", "Cafe oriental", "", 5000, EnumSize.HALF);
        mainDish.addPart(dh2);
        //this.getDish().addPart(new Dish("Coffee", "Cafe oriental", "", 5000, EnumSize.HALF));

    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

}
