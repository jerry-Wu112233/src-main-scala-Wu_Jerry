class FibonacciSeq extends App {

  def fibonacciRec(x : Int): Int = {
    if (x == 0)
      x
    else if (x == 1)
      x
    else
      fibonacciRec(x-1) + fibonacciRec(x-2)
  }

  def fibonacciIter(t: Int): Int = {
    var t0 = 0
    var t1 = 1
    var temp = 0
    if(t == 0)
      return 0
    else if(t == 1)
      return 1
    else
      for (a <- 0 until t-1) {
        temp = t0 + t1
        t0 = t1
        t1 = temp
      }
    temp
  }
}
