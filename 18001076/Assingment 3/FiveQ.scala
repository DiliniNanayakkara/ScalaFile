object FiveQ {

    
    def main(args: Array[String]) {
    
      println(SumOfEven(8))
   }
       def SumOfEven(n:Int):Int ={
           if (n==0){
               return 0;
           }else if (n%2==1){
        SumOfEven(n-1)
        }else{
          n+SumOfEven(n-1)
        }



    }
}
