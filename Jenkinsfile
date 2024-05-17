pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout del código fuente
                git branch: 'master', url: 'https://github.com/eleazarCorona/RESTAPI_DOCKER.git'
            }
        }
        stage('Build') {
            steps {
                // Comandos para compilar tu API
                // Para un proyecto de Spring Boot, normalmente usarás Maven o Gradle
                sh 'mvn clean package' // Ejemplo usando Maven
            }
        }
        stage('Test') {
            steps {
                // Comandos para ejecutar pruebas
                sh 'mvn test' // Ejemplo usando Maven
            }
        }
        stage('Build Docker Image') {
            steps {
                // Construir la imagen Docker
                sh 'docker-compose build'
            }
        }
        stage('Deploy') {
            steps {
                // Desplegar usando Docker Compose
                sh 'docker-compose down' // Detener cualquier instancia en ejecución
                sh 'docker-compose up -d' // Levantar contenedores en segundo plano
            }
        }
    }
    post {
        always {
            // Limpieza después de la ejecución del pipeline
            cleanWs()
        }
        success {
            // Notificaciones en caso de éxito
            echo 'Pipeline ejecutado con éxito!'
        }
        failure {
            // Notificaciones en caso de fallo
            echo 'Pipeline falló'
        }
    }
}
