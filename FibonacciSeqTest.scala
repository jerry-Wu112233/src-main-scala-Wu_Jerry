import org.scalatest.FunSuite

class FibonacciSeqTest extends FunSuite {
  test("FibonacciSeq.fibonacciIter") {
    assert(FibonacciSeq.fibonacciIter(2) === 1 )
    assert(FibonacciSeq.fibonacciIter(10) === 34 )
  }
}