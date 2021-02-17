package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

interface GamePattern {
    var cellPositions: Array<CellPosition>
    val patternName: String
}
