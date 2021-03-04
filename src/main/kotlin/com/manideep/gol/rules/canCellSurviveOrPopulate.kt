package com.manideep.gol.rules
//    Each cell with one or no neighbors dies, as if by solitude. - 1st check
//    Each cell with four or more neighbors dies, as if by overpopulation.  - 2nd Check
//    Each cell with two or three neighbors survives - 3rd Check
//    Each cell with three neighbors becomes populated. - 4th check

     fun canCellSurviveOrPopulate(isAlive: Boolean, countOfNeighborsAlive: Int): Boolean =
        if (isAlive && countOfNeighborsAlive in 0..1) false
        else if (isAlive && countOfNeighborsAlive in 4..8) false
        else if (isAlive && countOfNeighborsAlive in 2..3) true
        else !isAlive && countOfNeighborsAlive == 3
