package basics.designPatterns.factoryMethod

interface Pizza {
    fun cut()
    fun prepare()
    fun serve()
}

class MargheritaPizza : Pizza{
    override fun cut() {
        println("cutting ${this.javaClass.name} ")
    }

    override fun prepare() {
        println("preparing ${this.javaClass.name} ")
    }

    override fun serve() {
        println("serving ${this.javaClass.name} ")
    }
}

class VegLoadedPizza : Pizza{
    override fun cut() {
        println("cutting ${this.javaClass.name} ")
    }

    override fun prepare() {
        println("preparing ${this.javaClass.name} ")
    }

    override fun serve() {
        println("serving ${this.javaClass.name} ")
    }
}

class PizzaFactory(){
    fun createPizza(type : String) : Pizza{
        return when(type){
            "Margherita" -> MargheritaPizza()
            "VegLoaded" -> VegLoadedPizza()
            else -> error("Please select the pizza")
        }
    }
}

fun main(){
    val pizzaFactory = PizzaFactory()

    val margheritaPizza = pizzaFactory.createPizza("Margherita")
    margheritaPizza.prepare()
    margheritaPizza.cut()
    margheritaPizza.serve()

    val vegLoadedPizza = pizzaFactory.createPizza("VegLoaded")
    vegLoadedPizza.prepare()
    vegLoadedPizza.cut()
    vegLoadedPizza.serve()
}

