Buenas chicos:

Recordad los pasos previos para poder trabajar en Java.

Instalar el JDK correspondiente a vuestro sistema operativo, 
en la versión que os indiquen y descargad el entorno de 
desarrollo integrado Eclipse, también en la versión que gastéis.

Posteriormente, para importar el proyecto en vuestro workspace, simplemente:

1) Copiad la URL https://github.com/Valexx55/AccentureBBVA
2) Botón derecho sobre el área en blanco del workspace, Import --> Git --> Projects From Git --> Clone URI --> next
3) Pegamos la URL anterior y seleccionamos la rama master
4) Después, deberíamos seleccionar Import existing Eclipse projects para acabar aceptando

Pueden aparecer problemas de compilación, debido a las dependencias de las bibliotecas.
Recordad que si estuivéramos en Maven, esto no nos pasaría, porque los jars empleados 
en nuestro proyecto, estarían referenciados en el pom.xml y se descargarían automáticamente.

Para nuestros proyectos Java "normales" -no Maven-; botón derecho, properties, Java buildpath
y ahí, en la pestaña libraries, podemos ver, editar, añadir los jar que faltan o sobran

Todos los jars los podéis sacar del repositorio central de Maven, salvo el de Oracle, que por
motivos de licencia, no está ahí; pero lo podéis descargar, por ejemplo, de aquí:

https://github.com/Valexx55/JavaExamples/blob/master/BasicsExamplesJSE/ojdbc6.jar

Os desea lo mejor, 
Val.
