object Salary {
   def main(args: Array[String]) {
       var wh=150 //working 1 hour pay 150
       var oh=75 //ot hours pay 75
       var u=(wh*40+oh*20)
       
      println("Salary per week = "+(u-u*.10))
   }
}