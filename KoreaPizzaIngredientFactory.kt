package abstractFactory

class KoreaPizzaIngredientFactory: PizzaIngredientFactory  {
    override fun createDough(): Dough {
        TODO("Not yet implemented")
    }

    override fun createSauce(): Sauce {
        TODO("Not yet implemented")
    }

    override fun createCheese(): Cheese {
        TODO("Not yet implemented")
    }

    override fun createVeggies(): Array<Veggies> {
        val veggies = arrayOf(Garlic(), Onion(), Mushroom(), RedPepper())
        return veggies
    }

    override fun createPepperoni(): Pepperoni {
        TODO("Not yet implemented")
    }

    override fun createClam(): Clams {
        TODO("Not yet implemented")
    }

    override fun createKimchi(): Kimchi {
        return HotSpiceKimchi()
    }
}