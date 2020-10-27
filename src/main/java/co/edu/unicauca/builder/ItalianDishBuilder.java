package co.edu.unicauca.builder;

/**
 *
 * @author Camilo Gonzalez
 */
public class ItalianDishBuilder extends DishBuilder {
/**
 * crea el plato principal
 */
    @Override
    public void setCore() {
        this.setDish(new ItalianDish("Arroz Italiano", " Arroz a la italiana , añadiendo ingredientes donde se concentra los aromas y sabores de la comida italiana como el arroz carnaroli, las verduras y la Mozzarella", "", 73000, EnumSize.ALL, "Italia"));
    }
/**
 * adiciona las partes que tendra el plato principal
 */
    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Bruschettas", " Bruschettas como entrada", "", 6500, EnumSize.ALL));
        this.getDish().addPart(new Dish("Vino", "Tommasi Amarone", "", 9000, EnumSize.HALF));

    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

}
