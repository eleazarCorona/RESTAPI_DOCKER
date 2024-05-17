# Usa una imagen de OpenJDK como base
FROM openjdk:17-alpine

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor
COPY target/app-0.0.1-SNAPSHOT.jar /app/app.jar

# Expone el puerto 8080 para que la aplicación sea accesible
EXPOSE 4545

# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "app.jar"]
