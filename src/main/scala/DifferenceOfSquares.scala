import scala.math.pow

object DifferenceOfSquares{

  def sumOfSquares(n: Int): Int = 
  {
    var lim = n
    var totalsum = 0
    while (lim > 0)
    {
      var powered: Int = (pow(lim, 2)).toInt
      totalsum = totalsum + powered
      lim = lim-1
    }
    totalsum
  }

  def squareOfSum(n: Int): Int = 
  {
    var lim = n
    var totalsum = 0
    while (lim > 0)
    {
      totalsum = totalsum + lim
      lim = lim-1
    }
    var squareSum: Int = pow(totalsum, 2).toInt
    squareSum
  }

  def differenceOfSquares(n: Int):Int = 
  {
    var sqOfsum = squareOfSum(n)
    var sumOfsq = sumOfSquares(n)

    var totalDifference = sqOfsum - sumOfsq
    totalDifference
  }
}

// Testing the code

var sumOfsq = DifferenceOfSquares.sumOfSquares(10)
var sqOfsum = DifferenceOfSquares.squareOfSum(10)

println(DifferenceOfSquares.squareOfSum(10))
println(DifferenceOfSquares.sumOfSquares(10))
println(DifferenceOfSquares.differenceOfSquares(10))