#language:es
#encoding:UTF-8
#Author: Valentina

Característica: Seleccionar productos en exito.com
  yo como usuario de la pagina exito.com
  quiero seleccionar cinco productos por distintas cantidades

  Antecedentes:
    Dado que estoy loggeado en la pagina

  Escenario: Seleccionar productos
    Cuando selecciono la categoria Tecnologia y la subcategoria Televisores
    Y selecciono los televisores de forma aleatoria y agrego cantidades diferentes a cada seleccion
    Entonces Deberia visualizar los nombres precios cantidades y numero de productos
