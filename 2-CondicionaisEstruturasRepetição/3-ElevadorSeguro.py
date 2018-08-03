#ler pesos

pesos = []
novo_peso= int(input())
quantidade=0
soma_pesos = 0

while novo_peso != 0 and quantidade<=7 and soma_pesos <= 560 :
    pesos.append(novo_peso)
    novo_peso = int(input())
    soma_pesos = soma_pesos + pesos[quantidade]
    quantidade = quantidade + 1

if soma_pesos <= 560:
    soma_pesos = soma_pesos - pesos[quantidade]

print(Quantidade)
print(soma_pesos)
