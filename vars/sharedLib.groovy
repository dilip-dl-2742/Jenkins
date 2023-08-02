def call() {
      sh 'docker pull tomcat:latest'
      sh 'docker run -d --name Tomcat-sharedLib -p 8037:8080 tomcat:latest'
      sh 'docekr ps -a'
}
