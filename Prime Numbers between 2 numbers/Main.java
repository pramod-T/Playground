def isprime(n):
  for i in range(2,n//2+1):
    if (n % i) == 0:
      return False
  else:
    return True
n=int(input())
l=[]
for i in range(2,n+1):
  if isprime(i):
    l.append(i)
print(' '.join(str(x) for x in l))

    