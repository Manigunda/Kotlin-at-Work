package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BlockPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(12, 12), CellPosition(12, 13),
        CellPosition(13, 12), CellPosition(13, 13)

    )
    override val patternName: String
        get() = "BlockPattern"

}
