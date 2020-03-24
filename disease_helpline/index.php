<?php

require('db.php');

$rst_doctor = $mysqli->query('SELECT * FROM doctor');

$rst_dept = $mysqli->query('SELECT * FROM department');

$rst_city = $mysqli->query('SELECT * FROM city');

$rst_hospital = $mysqli->query('SELECT * FROM hospital');

$rst_area = $mysqli->query('SELECT * FROM area');

$rst_disease = $mysqli->query('SELECT * FROM disease');

$rst_degree = $mysqli->query('SELECT * FROM degree');

$rst_chamber = $mysqli->query('SELECT * FROM chamber');

$rst_dnd = $mysqli->query('SELECT * FROM dis_n_dept');

$rst_drVisitingDay = $mysqli->query('SELECT * FROM dr_visiting_day');

$rst_hosndept = $mysqli->query('SELECT * FROM hos_n_dept');



$data = array(
	"status"=>false,
	"doctorList"=>array(),
	"degreeList"=>array(),
	"hospitalList"=>array(),
	"chamberList"=>array(),
	"departmentList"=>array(),
	"diseaseList"=>array(),
	"disAndDeptList"=>array(),
	"visitingDayList"=>array(),
	"hosndeptList"=>array(),
	"cityList"=>array(),
	"areaList"=>array()
);

if ($rst_doctor->num_rows > 0) {
	$data["status"] = true;
	while ( $row = $rst_doctor->fetch_assoc()) {
		array_push($data["doctorList"], $row);
	}
}

if ($rst_dept->num_rows>0) {
	while ($row = $rst_dept->fetch_assoc()) {
		array_push($data["departmentList"], $row);
	}
}

if ($rst_city->num_rows>0) {
	while ($row = $rst_city->fetch_assoc()) {
		array_push($data["cityList"], $row);
	}
}

if ($rst_hospital->num_rows>0) {
	while ($row = $rst_hospital->fetch_assoc()) {
		array_push($data["hospitalList"], $row);
	}
}

if ($rst_area->num_rows>0) {
	while ($row = $rst_area->fetch_assoc()) {
		array_push($data["areaList"], $row);
	}
}

if ($rst_disease->num_rows>0) {
	while ($row = $rst_disease->fetch_assoc()) {
		array_push($data["diseaseList"], $row);
	}
}

if ($rst_degree->num_rows>0) {
	while ($row = $rst_degree->fetch_assoc()) {
		array_push($data["degreeList"], $row);
	}
}

if ($rst_chamber->num_rows>0) {
	while ($row = $rst_chamber->fetch_assoc()) {
		array_push($data["chamberList"], $row);
	}
}

if ($rst_dnd->num_rows>0) {
	while ($row = $rst_dnd->fetch_assoc()) {
		array_push($data["disAndDeptList"], $row);
	}
}

if ($rst_drVisitingDay->num_rows>0) {
	while ($row = $rst_drVisitingDay->fetch_assoc()) {
		array_push($data["visitingDayList"], $row);
	}
}

echo json_encode($data);

?>