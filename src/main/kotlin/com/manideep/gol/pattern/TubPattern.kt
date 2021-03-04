package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class TubPattern : GamePattern{
    override var cellPositions = arrayOf(
        CellPosition(6, 12),
        CellPosition(7, 11), CellPosition(7, 13),
        CellPosition(8, 12)

    )
    override val patternName: String
        get() = "TubPattern"
}