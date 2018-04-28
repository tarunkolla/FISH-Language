startFISH
	$n
	write "Enter Number:"
	read n
	$fact
	fact = 1
	loop (n > 0):
		fact = fact * n
		n = n - 1
	endloop
	write "Factorial: " 
	write fact
endFISH