#!/bin/bash

while getopts ":pc" opt; do
  case $opt in
    p)
      echo "Archivo empaquetado"
      mvn package -f "pom.xml"
      ;;
    c)
      echo "Archivo compilado"
      mvn compile -f "pom.xml"
      ;;
    \?)
      echo "Opción inválida: -$OPTARG"
      ;;
  esac
done

# Si no se proporciona ninguna bandera, ejecuta el comando "echo HOLA"
if [ $OPTIND -eq 1 ]; then
  echo "HOLA"
fi
