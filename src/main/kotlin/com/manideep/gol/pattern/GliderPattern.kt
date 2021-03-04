package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class GliderPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(7, 12), CellPosition(8, 13),
        CellPosition(9, 11), CellPosition(9, 12), CellPosition(9, 13)

    )
    override val patternName: String
        get() = "GliderPattern"

}
