def call() {
      sh 'docker pull tomcat:latest'
      sh 'docker run -d --name Tomcat-shareLib -p 8008:8080 tomcat:latest'
      sh 'docker ps -a'
      echo 'Congratulations! You successfull created a tomcat container'
}
