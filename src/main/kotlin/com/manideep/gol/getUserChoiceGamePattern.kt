package com.manideep.gol

import com.manideep.gol.pattern.*
import java.util.*

fun getUserChoiceGamePattern(): GamePattern {

    println("1. blockPattern")
    println("2. blinkerPattern")
    println("3. gliderPattern")
    println("4. beeHivePattern")
    println("5. toadPattern")
    println("6. lwssPattern")
    println("7. loafPattern")
    println("8. beaconPattern")
    println("9. mwssPattern")
    println("10. TubPattern")
    println("11. boatPattern")
    println("12. hwssPattern")
    println("13. pulsarPattern")
    println("14. pentadecathlonPattern")


    println("*******Waiting for UserINPUT********")
    val scanner = Scanner(System.`in`)
    val patternNumber =  scanner.nextInt()

    val blockPattern = BlockPattern()
    val blinkerPattern = BlinkerPattern()
    val gliderPattern = GliderPattern()
    var beeHivePattern = BeeHivePattern()
    var toadPattern = ToadPattern()
    var lwssPattern = LWSSPattern()
    var loafPattern = ToadPattern()
    var beaconPattern = BeaconPattern()
    var mwssPattern = MWSSPattern()
    val tubPattern = TubPattern()
    val boatPattern = BoatPattern()
    var hwssPattern = HWSSPattern()
    val pulsarPattern = PulsarPattern()
    val pentadecathlonPattern = PentadecathlonPattern()

    return if (patternNumber == 1)
        blockPattern
    else if (patternNumber == 2)
        blinkerPattern
    else if (patternNumber == 3)
        gliderPattern
    else if (patternNumber == 4)
        beeHivePattern
    else if (patternNumber == 5)
        toadPattern
    else if (patternNumber == 6)
        lwssPattern
    else if (patternNumber == 7)
        loafPattern
    else if (patternNumber == 8)
        beaconPattern
    else if (patternNumber == 9)
        mwssPattern
    else if (patternNumber == 10)
        tubPattern
    else if (patternNumber == 11)
        boatPattern
    else if (patternNumber == 12)
        hwssPattern
    else if (patternNumber == 13)
        pulsarPattern
    else if (patternNumber == 14)
        pentadecathlonPattern
    else
        blockPattern
}