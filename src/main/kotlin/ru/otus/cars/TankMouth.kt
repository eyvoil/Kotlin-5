package ru.otus.cars

/**
 * Горловина бака
 */
abstract class TankMouth(protected val tank: Tank, val typeFuel: Fuel) {
    protected var openFlag: Boolean = false

    fun open() {
        if (openFlag){
            println("Горловина бака уже открыта")
        } else {
            openFlag = true
            println("Горловина бака открыта")
        }
    }

    fun close() {
        if (openFlag){
            openFlag = false
            println("Горловина бака закрыта")
        } else {
            println("Горловина бака уже закрыта")
        }
    }

    fun getContents(): Int {
        return tank.getContents()
    }

    abstract fun refuelTank(amount: Int)

    override fun toString(): String {
        return "Горловина бака для топлива вида: $typeFuel"
    }
}


class MouthPetrol(tank: Tank) : TankMouth(tank, Fuel.Petrol){
    override fun refuelTank(amount: Int){
        if (openFlag){
            println("Заправка $typeFuel : $amount л.")
            tank.receiveFuel(amount)
        } else {
            println("Откройте бак перез заправкой")
        }
    }
}
class MouthLpg(tank: Tank) : TankMouth(tank, Fuel.Lpg){
    override fun refuelTank(amount: Int) {
        if (openFlag){
            println("Заправка $typeFuel : $amount л.")
            tank.receiveFuel(amount)
        } else {
            println("Откройте бак перез заправкой")
        }
    }
}
