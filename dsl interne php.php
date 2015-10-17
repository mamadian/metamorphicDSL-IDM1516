<?php
	$email = stripslashes(htmlentities("dupondjean@univ-rennes1.fr"));
    if(preg_match('#^(([a-z0-9!\#$%&\\\'*+/=?^_`{|}~-]+\.?)*[a-z0-9!\#$%&\\\'*+/=?^_`{|}~-]+)@(([a-z0-9-_]+\.?)*[a-z0-9-_]+)\.[a-z]{2,}$#i',str_replace('&amp;','&',$email)))
    {
         echo '<span style="color:#00aa00;">L\'email <strong>'.$email.'</strong> est valide.</span>';
    }
    else
    {
		echo '<span style="color:#ff0000;">L\'email <strong>'.$email.'</strong> est invalide.</span>';
    }
?>
