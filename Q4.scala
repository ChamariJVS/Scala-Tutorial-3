import scala.math;

object Demo {
   def main(args: Array[String]) :Unit={
      val bookPrice = 24.95;
      val discount = 0.40;
      var shippingExtra = 0.75;
      var shippingFirst = 3.00;
      var totalBook = 60;

      var bookCost=bookPrice*(1-discount)*totalBook;
      var shippingCost=shippingFirst+(totalBook-50)*shippingExtra;
      println("Total wholesale cost:$ "+(bookCost+shippingCost));
  
  }
}
