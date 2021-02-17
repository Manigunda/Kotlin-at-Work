package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class ToadPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(12, 12), CellPosition(12, 13), CellPosition(12, 14),
        CellPosition(13, 11), CellPosition(13, 14), CellPosition(13, 13)
    )
    override val patternName: String
        get() = "ToadPattern"

}
