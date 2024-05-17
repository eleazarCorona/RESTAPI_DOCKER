pipeline {
    agent any

    environment {
        // Define variables de entorno si es necesario
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
                // Comandos para compilar tu API (opcional si ya tienes las imágenes)
                sh './mvnw clean package' // Ejemplo usando Maven Wrapper
            }
        }
        stage('Test') {
            steps {
                // Comandos para ejecutar pruebas (opcional si ya tienes las imágenes)
                sh './mvnw test' // Ejemplo usando Maven Wrapper
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Usar la imagen Docker existente y desplegar usando Docker Compose
                    sh 'docker-compose down' // Detener cualquier instancia en ejecución
                    sh 'docker-compose up -d' // Levantar contenedores en segundo plano
                }
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
