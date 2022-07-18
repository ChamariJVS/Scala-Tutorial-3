import scala.math;

object Demo {
   def main(args: Array[String]) :Unit={
    val PI = 3.14f;
    var radius :Double= 5;
    var volume :Double =0;

    volume=PI*radius*radius*radius*4.0/3;
    println("The volume of a sphere with radius 5: "+volume);
  
  }
}
