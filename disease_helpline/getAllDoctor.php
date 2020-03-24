 <?php

require('db.php');

$result = $mysqli->query('SELECT * FROM doctor');

$data = array(
	"status"=>false,
	"itemList"=>array()
);

if ($result->num_rows > 0) {
	$data["status"] = true;

	while ( $row = $result->fetch_assoc()) {

		//$row['item_img_url'] = $root_url.'/uploads/images/'.$row['item_img_url'];

		array_push($data["itemList"], $row);
	}
}

echo json_encode($data);

?>