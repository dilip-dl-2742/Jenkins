@Library('my-shared-library@main') _
pipeline {
    agent any

    stages {
        stage('Code Checkout') {
            steps {
                echo 'Initializing the Pipeline'
                echo '${DOCEKR_USERNAME}'
            }
        }
        stage('Docker Running Tomcat') {
            steps {
                sharedLib()
                //sh 'docker login -u ddoddi27'
                //sh "echo ${ddoddi27}"
                //sh 'docker run -d --name httpd-jenkins -p 8042:80 httpd:latest'
                //sh 'docker ps'
            }
        }
        stage('Build Success') {
            steps {
                echo 'Build Successfull'
            }
        }
    }
}
