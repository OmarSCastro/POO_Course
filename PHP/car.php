<?php
require_once('acount.php');
class Account {
    public $id;
    public $license;
    public $driver;
    public $pasenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "Licencia: $this->license Drvier: ".$this->driver->name;
    }
}

?>