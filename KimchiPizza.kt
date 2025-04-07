package factoryMethod

class KimchiPizza : Pizza() {
    init {
        name = "Korean Style Kimchi Pizza"
        dough = "수정"
        sauce = "수정"

        toppings.add("수정")
        toppings.add("수정")
    }
}