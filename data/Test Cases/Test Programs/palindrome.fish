startFISH
	$n
	write "enter a number:"
	read n
	$ntemp
	$digit
	$result
	ntemp = n
	result = 0
	loop (ntemp > 0):
		digit = ntemp % 10
		result = result * 10 + digit 
		ntemp = ntemp/10
	endloop
	if (result == n):
		write "Given number is palindrome"
	else:
		write "Given number is not palindrome"
	endif
endFISH