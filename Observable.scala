import scala.collection.mutable.ArrayBuffer

class Observable[A] extends Listener[A] {

  var listeners = new ArrayBuffer[Listener[A]](0);

  var amtOfListeners : Int = 0

  def addListener(listener : Listener[A]) : Unit = {

    if (amtOfListeners == 0) {

      listeners(0) = listener

    } else {

      listeners :+ listener

    }

    amtOfListeners += 1

  }

  def removeListener(listener : Listener[A]) : Unit = {

    listeners -= (listener)

  }

  def emit(message : A) : Unit = {

    for (a <- listeners) {
      a.onMessage(message)
    }

  }
}
