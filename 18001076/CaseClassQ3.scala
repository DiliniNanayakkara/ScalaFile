import math.{sqrt,pow}

object CaseClassQ3 extends App{

val p1= point(2,0);
val p2= point(2,3);
val p3= p1.distance(p2);

println(p1);
println(p2);
println(p3);

}

case class point(a:Int,b:Int){

def x:Int = a;
def y:Int = b;

def +(that:point) = (this.x+that.x,this.y+that.y);
def distance(that:point) = {sqrt(this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y)};
}