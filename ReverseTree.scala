class ReverseTree extends BinTree[A] {

  def reverseTree(x: BinTree[A]): BinTree[Any] = {


    var temp : BinTree[A]  = x.right
    var right : BinTree[A] = x.left
    var left : BinTree[A] = temp

    case Node[A](left: BinTree[A], right: BinTree[A]) => reverseTree(x.left), reverseTree(x.right)

    case Leaf[A](x:A) => None

    return x

  }

}
