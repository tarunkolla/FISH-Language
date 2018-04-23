startFISH
	$n
	write "Enter a number:"
	read n
	$ntemp
	$flag
	$temp
	flag = 0
	temp = 2
	ntemp = n
	write  "List of Prime Numbers less than given number:"
	loop (ntemp > 1):
		loop(ntemp > temp):
			if(ntemp % temp == 0):
				flag = 1
			endif
			temp = temp + 1	
		endloop
		if(flag == 0):
			write ntemp
		endif
		ntemp = ntemp - 1
		flag = 0
		temp = 2
	endloop
endFISH