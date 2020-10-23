l=["break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"]
n=input()
if n in l:
  print(str(n) +" is a keyword")
else:
  print(str(n) +" is not a keyword")