object  CaesarCipher{
  def main(args:Array[String])=
  {	
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val Ecrptn=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

	val Dcrptn=(c:Char,key:Int,a:String)=>if ((a.indexOf(c.toUpper)-key)>=0) a((a.indexOf(c.toUpper)-key)%a.size) else (a((a.indexOf(c.toUpper)-key)%a.size+26))
	
	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

	val s="Hellofriends"

	val ct=cipher(Ecrptn,s,5,alphabet)
	println(ct)

	val pt=cipher(Dcrptn,ct,5,alphabet)
	println(pt)

}
}
