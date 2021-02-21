package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BlockPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(12, 12), CellPosition(12, 13),
        CellPosition(13, 12), CellPosition(13, 13),
        CellPosition(8, 12), CellPosition(8, 13),
        CellPosition(9, 12),CellPosition(9, 13),
        CellPosition(12, 25),CellPosition(12, 26),
        CellPosition(13, 25),CellPosition(13, 26),
        CellPosition(8, 25),CellPosition(8, 26),
        CellPosition(9, 25),CellPosition(9, 26)


    )
    override val patternName: String
        get() = "BlockPattern"

}
