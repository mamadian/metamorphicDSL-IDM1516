<?php
$output = shell_exec('find . -name *.java -exec ls {} \;');
echo "$output";
?>