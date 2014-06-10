var restify = require('restify');
 
var ip_addr = '127.0.0.1';
var port    =  '9100';
 
var server = restify.createServer({
    name : "node-microservice"
});

server.use(restify.queryParser());
server.use(restify.bodyParser());
server.use(restify.CORS());
 
server.listen(port ,ip_addr, function(){
    console.log('%s listening at %s ', server.name , server.url);
});