fun numberOfBeams(bank: Array<String>): Int {
	var res=0
	var mlt=0
	for(i in 0 until bank.size){
		val str1 = bank[i].replace("0", "")
		if (str1.length>0) {
			if (mlt == 0) {
				mlt = str1.length
			} else {
				mlt*=str1.length
				res+=mlt
				mlt=str1.length
			}
		}
	}
	return res
}
fun main() {
	println("Hello World!")
	val bank = arrayOf("011001","000000","010100","001000")
	println(numberOfBeams(bank))
}