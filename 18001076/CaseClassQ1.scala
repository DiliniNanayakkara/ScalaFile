object CaseClassQ1 extends App{

val p1= point(2,0);
val p2= point(2,3);

println(p1);
println(p2);
println(p1+p2);

}

case class point(a:Int,b:Int){

def x:Int = a;
def y:Int = b;

def +(that:point) = (this.x+that.x,this.y+that.y);
}