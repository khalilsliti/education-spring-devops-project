def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t pattaclope/education:spring-app-1.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push pattaclope/education:spring-app-1.0'
    }
}


def deployApp(String serverIp, String serverUser) {
    echo 'deploying the application...'
    def composeRun = '"export MYSQLDB_USER=root MYSQLDB_ROOT_PASSWORD=khalil MYSQLDB_DATABASE=education MYSQLDB_LOCAL_PORT=3306 MYSQLDB_DOCKER_PORT=3306 SPRING_LOCAL_PORT=8080 SPRING_DOCKER_PORT=8080 && docker-compose up -d"'
    sshagent(credentials: ['deployment-server']) {
        sh "ssh -o StrictHostKeyChecking=no ${serverUser}@${serverIp} ${composeRun}"
    }
}

def sonarTest() {
    echo 'Sonar Testing'
    withSonarQubeEnv(installationName: 'sq') {

        sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
    }
}

def cleanUntaggedImages() {
    def cleanImages = 'docker image prune --force --filter "dangling=true"'
    sshagent(credentials: ['jenkins-server']) {

        sh "${cleanImages}"
    }
}

return this