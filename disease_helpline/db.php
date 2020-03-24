<?php

/*if(!isset($_GET['apiKey'])){
	die('connection refused, contact with the admin..');
}else{
	if ($_GET['apiKey'] != '1999acf8f5b5b7778558b3b0093b436b') {
		die('connection refused, contact with the admin..');
	}
}*/

$host = '127.0.0.1';
$user = 'root';
$pass = '';
$db_name = 'disease_helpline';

//establishing database connection
$mysqli = new mysqli($host, $user, $pass, $db_name);

//checking if connection is ok or not
if ($mysqli->connect_error) {
	die('I am dying here..');
}

$root_url = 'http://10.0.2.2/smart_kids_learning';

?>