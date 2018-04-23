startFISH
	$a
	$b
	$n
	$sum
	a = 0
	b = 1
	write "Enter a number:"
	read n
	write "Fibanocci series of given number of terms:"
	write a
	write b
	loop(n > 2):
		sum = a + b
		write sum
		a = b
		b = sum
		n = n - 1
	endloop
endFISH