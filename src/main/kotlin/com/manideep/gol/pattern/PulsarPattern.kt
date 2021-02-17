package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class PulsarPattern: GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(5, 6), CellPosition(5, 12),
        CellPosition(6, 6), CellPosition(6, 12),
        CellPosition(7, 6),CellPosition(7, 7),CellPosition(7, 11),CellPosition(7, 12),
        CellPosition(9, 2),CellPosition(9, 3),CellPosition(9, 4),CellPosition(9, 7),CellPosition(9, 8), CellPosition(9, 10),CellPosition(9, 11),CellPosition(9, 14),CellPosition(9, 15),CellPosition(9, 16),
        CellPosition(10, 4),CellPosition(10, 6),CellPosition(10, 8),CellPosition(10, 10),CellPosition(10, 12),CellPosition(10, 14),
        CellPosition(11, 6),CellPosition(11, 7),CellPosition(11, 11),CellPosition(11, 12),
        CellPosition(13, 6),CellPosition(13, 7),CellPosition(13, 11),CellPosition(13, 12),
        CellPosition(14, 4),CellPosition(14, 6),CellPosition(14, 8),CellPosition(14, 10),CellPosition(14, 12),CellPosition(14, 14),
        CellPosition(15, 2),CellPosition(15, 3),CellPosition(15, 4),CellPosition(15, 7),CellPosition(15, 8),CellPosition(15, 10),CellPosition(15, 11),CellPosition(15, 14),CellPosition(15, 15),CellPosition(15, 16),
        CellPosition(17, 6),CellPosition(17, 7),CellPosition(17, 11),CellPosition(17, 12),
        CellPosition(18, 6),CellPosition(18, 12),
        CellPosition(19, 6),CellPosition(19, 12),

    )
    override val patternName: String
        get() = "PulsarPattern"

}

