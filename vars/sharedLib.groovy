def call() {
      sh 'docker rm -f $(docker ps -a -q)'
      sh 'docker run -d --name tom -p 8811:8080 tomcat:latest'
      sh 'docker ps -a'
      echo 'Congratulations! You successfull created a tomcat container'
}
