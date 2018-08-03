n = int(input())
inverter = ""
while n != 0:
    palavra = input()
    for i in range(n-1,-1,-1):
        inverter = inverter + palavra[i]
    inverter = inverter + " "
    n = int(input())
print (inverter) 
