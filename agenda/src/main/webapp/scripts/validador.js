/**
 * Validação de formulário
 */

 function validar() {
	 // Só pra testar se tá carregando o script
	 // alert('teste')
	 let nome = frmContato.nome.value
	 let fone = frmContato.fone.value
	 if (nome === "") {
		 alert('Preencha o campo Nome')
		 frmContato.nome.focus()
		 return false		 
	 } else if (fone === "") {
		 alert('Preencha o campo Telefone')
		 frmContato.fone.focus()
		 return false
	 } else {
		 document.forms["frmContato"].submit()
	 }
 }