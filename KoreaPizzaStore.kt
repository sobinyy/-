package abstractFactory

class KoreaPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza? {
        var pizza: Pizza? = null
        val ingredientFactory: PizzaIngredientFactory =
            KoreaPizzaIngredientFactory()

        if (item == "cheese") {
            pizza = CheesePizza(ingredientFactory)
            pizza.name ="Korean Style Cheese Pizza"
        } else if (item == "veggie") {
            pizza = VeggiePizza(ingredientFactory)
            pizza.name ="Korean Style Veggie Pizza"
        } else if (item == "clam") {
            pizza = ClamPizza(ingredientFactory)
            pizza.name ="Korean Style Clam Pizza"
        } else if (item == "pepperoni") {
            pizza = PepperoniPizza(ingredientFactory)
            pizza.name ="Korean Style Pepperoni Pizza"
        } else if (item == "kimchi") {
            pizza = KimchiPizza(ingredientFactory)
            pizza.name = "Korean Style Kimchi Pizza"
        }
        return pizza
    }
}