/**
 * Confirmação de exlcusão de contatos no site/banco
 */

 function confirmar(idcon) {
	 let resposta = confirm("Confirma a exclusão desde contato?")
	 if (resposta === true) {
		// Confirmar se tá pegando o código correto.
//		 alert(idcon)
		window.location.href = "delete?idcon=" + idcon
	 }
 }