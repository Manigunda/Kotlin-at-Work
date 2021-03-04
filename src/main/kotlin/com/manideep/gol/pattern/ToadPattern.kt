package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class ToadPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(6, 12), CellPosition(6, 13), CellPosition(6, 14),
        CellPosition(7, 11), CellPosition(7, 12), CellPosition(7, 13)

    )
    override val patternName: String
        get() = "ToadPattern"

}
