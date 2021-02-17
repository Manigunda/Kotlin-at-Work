package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class GliderPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(11, 12), CellPosition(12, 13),
        CellPosition(13, 11), CellPosition(13, 12), CellPosition(13, 13)

    )
    override val patternName: String
        get() = "GliderPattern"

}
