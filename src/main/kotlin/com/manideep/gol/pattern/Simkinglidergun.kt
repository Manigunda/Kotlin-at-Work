package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class Simkinglidergun: GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(2, 2),
        CellPosition(2, 3),
        CellPosition(2, 9),
        CellPosition(2, 10),
        CellPosition(3, 2),
        CellPosition(3, 3),
        CellPosition(3, 9),
        CellPosition(3, 10),
        CellPosition(5, 6),
        CellPosition(5, 7),
        CellPosition(6, 6),
        CellPosition(6, 7),
        CellPosition(11, 24),
        CellPosition(11, 25),
        CellPosition(11, 27),
        CellPosition(11, 28),
        CellPosition(12, 23),
        CellPosition(12, 29),
        CellPosition(13, 23),
        CellPosition(13, 30),
        CellPosition(13, 33),
        CellPosition(13, 34),
        CellPosition(14, 23),
        CellPosition(14, 24),
        CellPosition(14, 25),
        CellPosition(14, 29),
        CellPosition(14, 33),
        CellPosition(14, 34),
        CellPosition(15, 28),
        CellPosition(19, 22),
        CellPosition(19, 23),
        CellPosition(20, 22),
        CellPosition(21, 23),
        CellPosition(21, 24),
        CellPosition(21, 25),
        CellPosition(26, 25)

    )
    override val patternName: String
        get() = "Simkinglidergun"

}