<?php

$host = "https://www.univ-rennes1.fr/";
$page = "index.html";

$response = file_get_contents($host.$page);
print_r($response);
?>
