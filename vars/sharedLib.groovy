def call() {
      sh 'docker run -d --name dilip -p 8881:8080 tomcat'
      sh 'docker ps -a'
      echo 'Congratulations! You successfull created a tomcat container'
}
