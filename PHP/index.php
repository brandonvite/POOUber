<?php
    require_once('car.php');
    require_once('uberX.php');
    require_once('account.php');
    require_once('uberPool.php');

    $uber = new uberX("ASDF1234", new account("Brandon Vite Herrera", "VIDB93101"), "Seat", "Leon");
    $uber->printDataCar();

    $uberPool = new uberPool("ASDF1234", new account("Ramsel Delgadillo", "RVID95639"), "Ford", "Focus");
    $uberPool ->printDataCar();
?>