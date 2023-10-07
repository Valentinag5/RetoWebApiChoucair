#language:es
#encoding:UTF-8
#Author: Valentina

Característica: Verificar cada uno de los endpoint
  yo como usuario de la pagina dummy.com
  quiero probar cada uno de los endpoint


Esquema del escenario: Operaciones exitosas
Cuando ejecuto una solicitud de tipo <tipo> en el servicio
Entonces debería ver la respuesta respectiva de la solicitud de tipo <tipo>

  Ejemplos:
  | tipo     |
  | "GET"    |
  | "POST"   |
  | "PUT"    |
  | "DELETE" |

