pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World from Jenkins'
            }
        }
        stage('Webhook') {
            steps {
                echo 'Testing the webhook with GitHub'
            }
        }
        stage('Testing') {
            steps {
                echo 'Testing the Webhook in Jenkins Pipeline'
            }
        }
        stage('Build Success') {
            steps {
                echo 'Build Successfull and Webhook is on the way'
            }
        }
    }
}
