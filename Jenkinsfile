pipeline {
    agent { label 'python' }

    stages {
        stage('Start') {
            steps {
                echo "Starting pipeline for branch: ${env.BRANCH_NAME}"
            }
        }
        stage('Build') {
            steps {
                echo "Building on ${env.BRANCH_NAME}"
            }
        }
    }
    post {
        always {
            echo "Finished pipeline for ${env.BRANCH_NAME}"
        }
    }
}
