<?php
include "Spyc.php";
include "Lesson";

    $lesson1 = new Lesson("IDM", "i50", 2, "mathieu.acher@inria.fr");
    $lesson2 = new Lesson("AOC", "i52", 2, "noel.plouzeau@univ-rennes1.fr");
    $lessons = array("lesson 1" => $lesson1->toString(), "lesson 2" => $lesson2->toString());
    $sp = new Spyc();
    $yaml = Spyc::YAMLDump($lessons, 4, 100);

    $fic = fopen('resultat', 'r+');
    var_dump($sp);
    fputs($fic, $yaml);
    fclose($fic);