open Sys
open Printf

let exercice =
(* Commande de créant un fichier contenant "Hello World" *)
let cmd1 = Printf.sprintf("echo \"Hello World !\" > ./IDM_DSL.txt") in

(* Impression du contenu du fichier IDM_DSL.txt *)
let cmd2 = "cat ./IDM_DSL.txt" in

(* Suppression du fichier IDM_DSL.txt *)
(* La ligne peut être commenté pour garder le fichier *)
let cmd3 = "rm ./IDM_DSL.txt" in

let _ = Sys.command(cmd1) in
let _ = Sys.command(cmd2) in

(* La ligne peut être commenté pour garder le fichier *)
let _ = Sys.command(cmd3) in
();;
