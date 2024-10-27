package ru.otus.cars

interface Tank {
    /**
     * Количество топлива
     */
    val amountFuel: Int

    /**
     * Получить уровень топлива
     */
    fun getContents(): Int

    /**
     * Заполнить топливо
     */
    fun receiveFuel(liters: Int)
}

open class CarTank() : Tank {
    override var amountFuel = 0

    override fun getContents(): Int {
        return amountFuel
    }

    override fun receiveFuel(liters: Int){
        amountFuel += liters
    }
}

