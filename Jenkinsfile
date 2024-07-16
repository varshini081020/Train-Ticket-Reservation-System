pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/santhosh8328/Train-Ticket-Reservation-System.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
