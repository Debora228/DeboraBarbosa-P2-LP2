quantidade=1
novo_peso = int(input())
soma_pesos = novo_peso

while novo_peso != 0 and quantidade<=7 and soma_pesos <= 560 :
    novo_peso = int(input())
    soma_pesos = soma_pesos + novo_peso
    quantidade = quantidade + 1

if soma_pesos >= 560:
    soma_pesos = soma_pesos - novo_peso
    quantidade = quantidade - 1
    

print(quantidade)
print(soma_pesos)
