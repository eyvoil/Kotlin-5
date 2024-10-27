package ru.otus.cars

import kotlin.random.Random

object Taz: Car {
    /**
     * Номерной знак
     */
    override val plates: Car.Plates
        get() = throw NotImplementedError("Номера сняты")

    /**
     * Цвет машины
     */
    override val color: String = "Ржавый"

    /**
     * Следит за машиной
     */
    override val carOutput: CarOutput
        get() = throw NotImplementedError("Приборов нет")

    val tank: Tank = TazTank()

    private fun getRandomTankMouth(): TankMouth {
        return when (Random.nextInt(0, 2)) {
            0 -> MouthLpg(tank)
            else -> MouthPetrol(tank)
        }
    }

    override val tankMouth: TankMouth = getRandomTankMouth()

    /**
     * Получить оборудование
     */
    override fun getEquipment(): String = "Крыса"

    /**
     * Руль вправо на [degrees] градусов
     */
    override fun wheelToRight(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    /**
     * Руль влево на [degrees] градусов
     */
    override fun wheelToLeft(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }
}

class TazTank(): CarTank(){
    override fun receiveFuel(liters: Int){
        throw Exception("При заправке происходит взрыв бака")
    }
}