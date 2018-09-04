cond = "sim"
soma = 0
	
while cond != "não":
	num = int(input())
	cond = input()
	cond = cond.lower()
	
	if(num<=2):
		soma = soma + (9*30)
	else:
		soma = soma + (6*30)
if soma < 100:
    fral = 1
    rest = 0
elif soma % 100 ==0:
    fral = int(soma/100)
    rest = 100*fral - soma
else:
	fral = int(soma/100) + 1
	rest = 100*fral - soma
print(fral)
print(rest)
