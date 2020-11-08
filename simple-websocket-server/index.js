const express = require('express')
const uuid = require('uuid');
const SocketServer = require('ws').Server;
const bodyParser = require('body-parser');

const PORT = 5000

const connectionMap = new Map();

const app = express();
app.use(bodyParser.json());

app.post('/event/order-creation', (req, res)=>{
  connectionMap.forEach((connection, key) =>{
    connection.send(JSON.stringify(req.body));
  });
  res.status(204).end();
});


const server = app.listen(PORT, () => console.log(`Listening on ${PORT}`));
const wss = new SocketServer({ server });

wss.on('connection', ws => {

  console.log('Client connected')
  ws.uuid = uuid.v4();
  connectionMap.set(ws.uuid, ws);
  
  ws.on('close', () => {
    console.log('client disconnected');
    connectionMap.delete(ws.uuid);
  })
});