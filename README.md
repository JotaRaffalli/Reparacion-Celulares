# Reparacion-Celulares
Programa de una compañia que repara celulares

# Introducción
Programa hecho con java y estructuras de datos, como arboles binarios, listas simples y colas. Pose interfaz gráfica con swing de java.

# Preview del programa
### Intro del programa
![alt tag](https://github.com/Ricardo96r/Reparacion-Celulares/blob/master/especificaciones/ver.png)

### Agregar
![alt tag](https://github.com/Ricardo96r/Reparacion-Celulares/blob/master/especificaciones/agregar.png)

### Informacion
![alt tag](https://github.com/Ricardo96r/Reparacion-Celulares/blob/master/especificaciones/info.png)

# Especificaciones del programa
  Usted ha sido contratado por el Departamento de Sistemas y Procesos para automatizar la logística de una empresa de tecnología que repara celulares. En dicho sistema se desea manejar las sucursales en diferentes países, clientes y empleados.

  Principalmente se desea que exista una estructura eficiente para la búsqueda, que permita insertar, eliminar y/o mostrar los posibles países donde la empresa de tecnología maneja una sucursal. Un país puede tener varias sucursales, y de estas se conocen el nombre, número y gerente encargado. 
  
  La empresa tiene una cola de clientes que visitan una determinada sucursal para dejar el celular a reparar, los datos del cliente requeridos por el sistema son: Marca del teléfono, problema presentado, nombre, cédula, teléfono de contacto y fecha de ingreso del equipo. Cada sucursal posee originalmente 7 técnicos, los cuales tienen asignado una marca de teléfono donde son especialistas, estas marcas son: Huawei, Samsung, LG, Iphone, Nokia, Motorola y otros. De los técnicos se conoce nombre, marca de teléfono que repara, lista de clientes asignados y cola de clientes en espera; un técnico solo puede reparar un máximo de 10 teléfonos por día, si se excede este número, los próximos clientes pasan a una cola de espera.

  El sistema deberá guardar en una estructura dinámica una información para el control de la sucursal, dicha información es: nombre del cliente, teléfono de contacto, cedula del cliente, nombre del técnico que reparara su celular, si esta en cliente asignado o está en cola de espera, fecha de ingreso,  fecha de entrega y un estatus que dice si esta entregado o no. Cada técnico tiene 1 día para repara el celular, es decir si lo recibe hoy, tendrá que estar listo para el día siguiente, pero si esta en cola de espera saldrá al día siguiente de ser cargada la cola. Cada día, un técnico antes de tener clientes nuevos, deberá chequear si tiene una cola de espera del día anterior y dicha cola deberá ser cargada previamente en la lista de clientes asignados, considerando que sean 10 por día. 
  
  En líneas generales utilice todas las estructuras necesarias para hacer eficiente su sistema, considerar el manejo de la cola de espera y la lista informativa, pues debería estar en un archivo de objetos para ser siempre cargadas en el sistema y no perder información de un día para otro. Además de cada estructura dinámica manejada se espera insertar, eliminar, buscar (de ser necesario) y mostrar toda la información almacenada. 
