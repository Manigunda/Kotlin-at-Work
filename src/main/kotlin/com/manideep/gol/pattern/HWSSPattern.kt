package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class HWSSPattern: GamePattern{
    override var cellPositions = arrayOf(
        CellPosition(4, 7), CellPosition(4, 8),
        CellPosition(5, 3),CellPosition(5, 4),CellPosition(5, 5),CellPosition(5, 6), CellPosition(5, 8),CellPosition(5, 9),
        CellPosition(6, 3) ,CellPosition(6, 4), CellPosition(6, 5),CellPosition(6, 6),CellPosition(6, 7),CellPosition(6, 8),
        CellPosition(7, 4), CellPosition(7, 5),CellPosition(7, 6),CellPosition(7, 7)

    )
    override val patternName: String
        get() = "HWSSPattern"

}