object Profit {

def main(args:Array[String]) {
var l = 10 
var m = 15 
var h = 20

var lpcost= 10*140 -500 -3*140
var mpcost= 15*120 -500 -120*3
var hpcost= 20*100 -500 -3*100

if( lpcost>mpcost) {

    if(lpcost>hpcost){
   printf("The best price is 10 this total  profit is= "+lpcost)
    }else{
         printf("The best price is 20 this total  profit is= "+hpcost)
    }
}else{
    if(mpcost>hpcost){
         printf("The best price is 15 this total  profit is= "+mpcost)
    }else{
         printf("The best price is 20 this total  profit is= "+hpcost)
    }
    
}
}
}