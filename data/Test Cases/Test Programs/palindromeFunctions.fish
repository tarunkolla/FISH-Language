startFISH
	$n
	write "enter a number:"
	read n
	$ntemp
	$result
	ntemp = n
	result = REVERSE (ntemp)
	if (result == n):
		write "Given number is palindrome"
	else:
		write "Given number is not palindrome"
	endif
endFISH

fun REVERSE($x):
	$digit
	$res
	$xtemp 
	xtemp = x
	res = 0
	loop ( xtemp > 0):
		digit = xtemp % 10
		res = res * 10 + digit 
		xtemp = xtemp/10
	endloop
	return res
endfun