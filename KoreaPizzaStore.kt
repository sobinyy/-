package factoryMethod



class KoreaPizzaStore : PizzaStore() {
    public override fun createPizza(item: String): Pizza? {
       return if (item == "kimchi")
           KimchiPizza()
       // 기타 다른 피자 생성 코드 추가
       else null
    }
}