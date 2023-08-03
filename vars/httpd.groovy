def call() {
  sh 'docker run -d --name httpd-web-server -p 8888:80 httpd:latest'
  echo 'Here you go!'
}
