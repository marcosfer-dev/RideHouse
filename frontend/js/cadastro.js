const formulario = document.querySelector('form');

formulario.addEventListener('submit', function(event) {
    event.preventDefault();

    const dados = new FormData(formulario);
    console.log(Object.fromEntries(dados));

    const usuario = {
        nomeCompleto: dados.get('nomeCompleto'),
        email: dados.get('email'),
        cpf: dados.get('cpf'),
        dataNascimento: dados.get('dataNascimento'),
        telefone: dados.get('telefone'),
        genero: dados.get('genero'),
        senha: dados.get('senha'),
        aceitouTermos: dados.get('aceitouTermos') === 'on'
    }

    console.log(usuario);

    fetch('http://localhost:8080/usuarios', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(usuario)
    });
});