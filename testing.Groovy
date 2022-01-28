def mvnTest() {
    // checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '9c2c4b85-d15b-4721-b0fe-c11be6030233', url: 'https://github.com/alex-man21/java_jenkins_pipeline']]]
    sh 'mvn clean install'
    sh 'mvn -Dtest=BasicDemo test'
}

def npmTest(message) {
    echo message
    // checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '9c2c4b85-d15b-4721-b0fe-c11be6030233', url: 'https://github.com/alex-man21/tutorial-selenium-javascript-ultrafastgrid']]]
    sh 'npm i'
    // sh 'npm run test'
    sh 'npx mocha --no-timeouts "test/*.js"'
}

return this