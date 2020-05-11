package chapter8

class Wolf(var hunger: Int = 50) {

    fun eat(): Unit {
        if (hunger > 1) {
            hunger -= 2
        } else {
            hunger = 0;
        }
    }
}

class MyWolf {
    var wolf: Wolf? = Wolf()

    fun myFunciton() {
        wolf?.eat()
    }

    fun getAlphaWolf() : Wolf? {
        return Wolf()
    }
}