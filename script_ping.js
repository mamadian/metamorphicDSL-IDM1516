var spawn = require('child_process').spawn,
    ls    = spawn('ping', ['localhost']);

ls.stdout.on('data', function (data) {
	dataToPrint = "" + data;
	dataToPrintNicely = dataToPrint.substring(0, dataToPrint.length - 1);
	console.log(dataToPrintNicely);
});
