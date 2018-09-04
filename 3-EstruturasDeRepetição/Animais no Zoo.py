cond = "continuar"
contM, contT, contC, somaT = 0, 0, 0, 0
while cond !="parar":
	animal = input()
	peso = float(input())
	local = input()
	animal = animal.lower()
	
	cond = input()
	cond = cond.lower()
	
	if animal == "macaco":
		contM += 1
	if animal == "tigre":
		contT += 1
		somaT = somaT + peso
	if animal == "cobra" and local.lower() == "venezuela":
		contC += 1
print(contM)
if contT != 0:
	media =somaT/contT
	print("%.2f"%media)
else:
	print("%.2f"%0)
print(contC)	
