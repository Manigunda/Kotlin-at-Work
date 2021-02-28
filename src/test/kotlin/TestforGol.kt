import com.manideep.gol.rules.canCellSurviveOrPopulate
import org.junit.Assert
import org.junit.Test
class TestforGol {

    // funcanCellSurviveOrPopulate(isAlive:Boolean,countOfNeighborsAlive:Int):Boolean=
    // if (isAlive && countOfNeighborsAlive in 0...1) false
    // elseif (isAlive && countOfNeighboursAlive in 4...8) false
    // elseif (isAlive && countOfNeighboursAlive in 2...3) true
    // elseif !isAlive && countOfNeighboursAlive == 3

    @Test
    fun canAliveCellSurviveWithZeroNeighbours(){
        Assert.assertFalse(canCellSurviveOrPopulate(true,0))
    }

    @Test
    fun canAliveCellSurviveWithOneNeighbour(){
        Assert.assertFalse(canCellSurviveOrPopulate(true,1))
    }

    @Test
    fun canAliveCellSurviveWithTwoNeighbours(){
        Assert.assertTrue(canCellSurviveOrPopulate(true,2))
    }

    @Test
    fun canAliveCellSurviveWithThreeNeighbours(){
        Assert.assertTrue(canCellSurviveOrPopulate(true,3))
    }

    @Test
    fun canAliveCellSurviveWithfourNeighbours(){
        Assert.assertFalse(canCellSurviveOrPopulate(true,4))
    }

    @Test
    fun canAliveCellSurviveWithfiveNeighbours(){
        Assert.assertFalse(canCellSurviveOrPopulate(true,5))
    }

    @Test
    fun canAliveCellSurviveWithSixNeighbours(){
        Assert.assertFalse(canCellSurviveOrPopulate(true,6))
    }

    @Test
    fun canAliveCellSurviveWithSevenNeighbours(){
        Assert.assertFalse(canCellSurviveOrPopulate(true,7))
    }

    @Test
    fun canAliveCellSurviveWithEightNeighbours(){
        Assert.assertFalse(canCellSurviveOrPopulate(true,8))
    }

    @Test
    fun canEmptyCellPopulateWithThreeNeighbours(){
        Assert.assertTrue(canCellSurviveOrPopulate(false,3))
    }

}