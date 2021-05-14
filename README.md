# Threads_Senha

Desenvolva um sistema de busca de senha baseado em threads. A senhaREAL possui  6 dígitos numéricos e deve ser transformada/manipulada como string. 

string = "000003"

range da senha = 000000 até 999999

for 000000 até 999999 -> tentativa

	if tentativa == senhaREAL

		ok

---------------------------------------

onde entram as threads?



dividir a "busca da senha" através de threads



threads = 4

senhaREAL = 897345

requisitos

1-se uma thread achar a senha correta, ela interrompe a execução das demais

2-cada thread recebe no construtor o escopo de busca

3-a senhaREAL é uma variável static 
