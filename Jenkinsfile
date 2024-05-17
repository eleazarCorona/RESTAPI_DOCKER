pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3' // Nombre de la instalación de Maven configurada en Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout del código fuente
                git branch: 'master', url: 'https://github.com/eleazarCorona/RESTAPI_DOCKER.git'
            }
        }
        stage('Build') {
            steps {
                // Navegar al directorio correcto si el pom.xml no está en el directorio raíz
                dir('app') {
                    // Comandos para compilar tu API
                    sh 'mvn clean package' // Ejemplo usando Maven
                }
            }
        }
        stage('Test') {
            steps {
                // Navegar al directorio correcto si el pom.xml no está en el directorio raíz
                dir('app') {
                    // Comandos para ejecutar pruebas
                    sh 'mvn test' // Ejemplo usando Maven
                }
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
