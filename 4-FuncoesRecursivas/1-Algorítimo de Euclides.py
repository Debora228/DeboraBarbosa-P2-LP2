def euclides (A, D):
    R = A%D
    if R == 0:
        return D
    else:
        return euclides(D,R)
n = int(input())

for i in range(n):
    a,d = list(map(int,input().split()))
    print("MDC({},{}) = {}".format(a,d,euclides(a,d)),"\n")

