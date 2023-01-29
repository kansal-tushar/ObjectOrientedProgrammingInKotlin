package com.techmania.objectorientedprogramming

fun main(args: Array<String>) {

    //creating an object from Car class
    var car=Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 320

    car.show()

    //creating an object from MotorCycle class
    var motor=Motorcycle()
    motor.type="MotorCycle"
    motor.model = "Yamha"
    motor.maxSpeed = 180

    motor.show()

}