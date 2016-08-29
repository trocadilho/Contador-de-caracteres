with open ("dom_casmurro.txt", encoding='utf-8') as f:
	text = f.read()

caracteres = []
for i in range(26):
	caracteres.append(0)

for c in text:
	if(c=='A' or c=='a' or c=='À' or c=='à' or c=='Ã' or c=='ã' or c=='Â' or c=='â' or c=='Á' or c=='á'):
		caracteres[0]+=1
	elif(c=='B' or c=='b'):
		caracteres[1]+=1
	elif(c=='C' or c=='c' or c=='Ç' or c=='ç'):
		caracteres[2]+=1
	elif(c=='D' or c=='d'):
		caracteres[3]+=1
	elif(c=='E' or c=='e' or c=='É' or c=='é' or c=='Ê' or c=='ê'):
		caracteres[4]+=1
	elif(c=='F' or c=='f'):
		caracteres[5]+=1
	elif(c=='G' or c=='g'):
		caracteres[6]+=1
	elif(c=='H' or c=='h'):
		caracteres[7]+=1
	elif(c=='I' or c=='i' or c=='Í' or c=='í'):
		caracteres[8]+=1
	elif(c=='J' or c=='j'):
		caracteres[9]+=1
	elif(c=='K' or c=='k'):
		caracteres[10]+=1
	elif(c=='L' or c=='l'):
		caracteres[11]+=1
	elif(c=='M' or c=='m'):
		caracteres[12]+=1
	elif(c=='N' or c=='n'):
		caracteres[13]+=1
	elif(c=='O' or c=='o' or c=='Ó' or c=='ó' or c=='Õ' or c=='õ'):
		caracteres[14]+=1
	elif(c=='P' or c=='p'):
		caracteres[15]+=1
	elif(c=='Q' or c=='q'):
		caracteres[16]+=1
	elif(c=='R' or c=='r'):
		caracteres[17]+=1
	elif(c=='S' or c=='s'):
		caracteres[18]+=1
	elif(c=='T' or c=='t'):
		caracteres[19]+=1
	elif(c=='U' or c=='u' or c=='Ú' or c=='ú' or c=='Ü' or c=='ü'):
		caracteres[20]+=1
	elif(c=='V' or c=='v'):
		caracteres[21]+=1
	elif(c=='W' or c=='w'):
		caracteres[22]+=1
	elif(c=='X' or c=='x'):
		caracteres[23]+=1
	elif(c=='Y' or c=='y'):
		caracteres[24]+=1
	elif(c=='Z' or c=='z'):
		caracteres[25]+=1

print(caracteres)
