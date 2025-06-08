<p align="left">
<img src="https://img.shields.io/badge/STATUS-%20FINALIZADO-green">
</p>

<p align="center">
 
# APP CONVERSOR DE MONEDAS💱
</p>

## 1.-Introducción:

Este desafío se realizo un conversor de moneda utilizando un menú de opciones con monedas bases y monedas destino.
La aplicación debe tener conexión a internet para el consumo de la API REST ExchangeRate-API

<img width="302" alt="image" src="https://github.com/user-attachments/assets/97fcd585-4825-4e05-b26e-a633be5b0bd4" />

## 2.-Funcionamiento:
1. Elige una de las opciones de (1 al 8) para convertir moneda. 
<img width="194" alt="image" src="https://github.com/user-attachments/assets/c8f67a50-4be3-4345-a491-e597f1d1a8b4" />

 2. Presiona Enter.
 3. ***La aplicación te mostrará la información de la tasa de conversión según la opción elegida en el menú***.
 4. Ingresa la cantidad de dinero que deseas convertir y presiona enter para continuar

<img width="224" alt="image" src="https://github.com/user-attachments/assets/3131365d-157f-4f8d-831f-953179b5a5ee" />

 5. La aplicación te brindará el resultado de la conversión de la moneda original a la moneda destino.
<img width="252" alt="image" src="https://github.com/user-attachments/assets/5049321a-4738-4eeb-b74e-97756d244824" />

 6. Y mostrará nuevamente el menú de opciones para elegir una nueva conversión. 
 7. Si no desea seguir convirtiendo Puede presional la opción 9 para salir del sistema

<img width="202" alt="image" src="https://github.com/user-attachments/assets/1795c1f7-414a-412c-ae37-b344502d10f3" />

## 3.-Desarrollo ☕:

Para el desarrollo de la app se utilizo el consumo de la api Exchange Rate API. En este caso no se ha empleado la api principal de exchange si no la api de conversión de pares por ejemplo:
[https://v6.exchangerate-api.com/v6/4d51da5836acdbe491917bcc/pair/PEN/USD ](https://v6.exchangerate-api.com/v6/4d51da5836acdbe491917bcc/pair/PEN/USD)
<img width="485" alt="image" src="https://github.com/user-attachments/assets/cdc18567-beee-4d0c-b3df-646e5bae1fa3" />

Nuestra APP de conversor de monedas esta implementada con 3 clases modelos, una clase de Exepcion para los errores de nuestra aplicación y una clase llamada principal para ejeuctar el funcionamiento de nuestra aplicación.

