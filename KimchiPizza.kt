package abstractFactory

class KimchiPizza (ingredientFactory: PizzaIngredientFactory?) : Pizza(ingredientFactory) {
    public override fun prepare() {
        println("Preparing $name")
       // dough = ingredientFactory!!.createDough()
       // sauce = ingredientFactory!!.createSauce()
       // cheese = ingredientFactory!!.createCheese()
        kimchi = ingredientFactory!!.createKimchi()
    }
}