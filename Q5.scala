import scala.math;

object Demo {
   def Time(rate:Double,distance:Double) : Double ={
      return rate*distance;
      } 
   def main(args: Array[String]) :Unit={
      var paceTime=Time(8,2)*2;
      var tempoTime=Time(7,3);

      println("Total running time:"+(paceTime+tempoTime));
  
  }
}
