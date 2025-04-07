package abstractFactory


class ChicagoPizzaIngredientFactory

    : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): Array<Veggies> {
        val veggies = arrayOf(
            BlackOlives(),
            Spinach(),
            Eggplant()
        )
        return veggies
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }

    override fun createKimchi(): Kimchi {
        TODO("Not yet implemented")
    }
}
