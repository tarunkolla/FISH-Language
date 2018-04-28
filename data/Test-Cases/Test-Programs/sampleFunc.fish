startFISH
	$a
	$b
	a = 1
	b = 2
	$c
	$d
	c = a + ADD(a+2*3, b)
	d = SUB(a,b)
	write MUL(a,(b+2)*3)
	write c
	write d
endFISH

fun MUL ($x,$y):
	$z
	z = x * y
	return z
endfun

fun SUB ($x,$y):
	$z
	z = x - y
	return z
endfun
fun ADD ($x,$y):
	$z
	z = x + y
	return z
endfun