<?php

require_once("car.php");
require_once("UberX.php");
require_once("UberPool.php")
require_once("account.php");

$uberX = new UberX("CVB234", new Account("Omar Castro", "IFE123"), "Chevrolet", "Spark");
$uberX->printDataCar();

?>  