object CaseClassQ4 extends App{

val p1= point(2,3);
val p2= point(2,5);

val p3= p1.move();
val p4 = p2.move();
println(p3);
println(p4);

}

case class point(a:Int,b:Int){

def x:Int = a;
def y:Int = b;

def move() = point(this.y,this.x);

}