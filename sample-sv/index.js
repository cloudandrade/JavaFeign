const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

//EXPRESS
const app = express();

//SERVER PORT
const PORT = process.env.PORT || 5000;

//BODY PARSER
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use(cors());

//ROUTES
app.use('/', require('./routes/index'));

//SERVER
app.listen(process.env.port || PORT, console.log(`Server started on port ${PORT}`));