package abstractFactory


fun main(args: Array<String>) {
    val nyStore: PizzaStore = NYPizzaStore()
    val chicagoStore: PizzaStore = ChicagoPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a $pizza\n")

    pizza = nyStore.orderPizza("clam")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("clam")
    println("Joel ordered a $pizza\n")

    pizza = nyStore.orderPizza("pepperoni")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("pepperoni")
    println("Joel ordered a $pizza\n")

    pizza = nyStore.orderPizza("veggie")
    println("Ethan ordered a $pizza\n")

    pizza = chicagoStore.orderPizza("veggie")
    println("Joel ordered a $pizza\n")

    val koreaStore: PizzaStore = KoreaPizzaStore()
    pizza = koreaStore.orderPizza("kimchi")
    println("Kwanwoo ordered a $pizza\n")
}

