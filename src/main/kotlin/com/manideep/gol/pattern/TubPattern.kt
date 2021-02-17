package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class TubPattern : GamePattern{
    override var cellPositions = arrayOf(
        CellPosition(12, 12),
        CellPosition(13, 11), CellPosition(13, 13),
        CellPosition(14, 12)

    )
    override val patternName: String
        get() = "TubPattern"
}