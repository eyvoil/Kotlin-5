package ru.otus.cars

class GasStation {
    fun refuelCar(car: Car, liters: Int){
        try{
            when(car.tankMouth.typeFuel){
                Fuel.Petrol -> refuelingPetrol(car,liters)
                Fuel.Lpg -> refuelingLpg(car,liters)
            }
        }
        catch (e: Exception){
            println("Заправка неуспешная: $e")
        }
    }

    private fun refuelingPetrol(car: Car, liters: Int){
        println("Начать заправку машины $car бензином $liters л.")
        car.tankMouth.open()
        car.tankMouth.refuelTank(liters)
        car.tankMouth.close()
    }

    private fun refuelingLpg(car: Car, liters: Int){
        println("Начать заправку машины $car газом $liters л.")
        car.tankMouth.open()
        car.tankMouth.refuelTank(liters)
        car.tankMouth.close()
    }
}