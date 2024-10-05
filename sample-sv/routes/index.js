const express = require('express');
const router = express.Router();

router.get('/', async (req, res) => {
	res.send('server online');
});

//get all itens
router.get('/pessoa', async (req, res) => {
	console.log('Buscando pessoa');
	const mockPessoa = {
        id: 1335389071,
        nome: 'Joao Claudio',
        idade: 31,
        cpf: 32194105012
    }   
    res.json(mockPessoa);
});

//update an iten
router.put('/pessoa/:id', async (req, res) => {
	console.log('Alterando pessoa');
	const pessoa = req.body;
	const id = req.params.id;

	console.log('Id Enviado: ');
	console.log(id);
	console.log('Objeto Enviado: ');
	console.log(pessoa);
    res.status(200).send('Pessoa alterado com sucesso')
});

module.exports = router;