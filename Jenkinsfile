pipeline {
    agent any

    stages {
        stage('Code Checkout') {
            steps {
                echo 'Initializing the Pipeline'
            }
        }
        stage('Docker Login') {
            steps {
                sh 'docker login -u ddoddi27'
                sh ${ddoddi27}
            }
        }
        stage('Build Success') {
            steps {
                echo 'Build Successfull'
            }
        }
    }
}
