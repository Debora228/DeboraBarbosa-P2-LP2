n = input()
nd = len(n)
n=int(n)
pow = 0
cont = 0
inverte = 0

while nd>=1:
	nd=nd-1
	pow = 10**nd
	v = n//pow
	n= n%pow
	inverte = inverte + v*(10**cont)
	cont = cont +1
print(inverte)
    
