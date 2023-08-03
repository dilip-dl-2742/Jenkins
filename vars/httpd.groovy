def call() {
  sh 'docker rm -f $(docker ps -a -q)'
  sh 'docker run -d --name httpd-web-server -p 8888:80 httpd:latest'
  echo 'Here you go!'
}
