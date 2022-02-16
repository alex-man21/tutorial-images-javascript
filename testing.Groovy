
def testSubGroovyFile() {
    echo "test sub groovy file"
}

def echo() {
    echo "inside testing.groovy"
}

def checkDirectory() {
    sh 'pwd'
    sh 'ls -ltr'
}

def checkout() {
    checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '9c2c4b85-d15b-4721-b0fe-c11be6030233', url: 'https://github.com/alex-man21/java_jenkins_pipeline']]]
}

def mvnTest() {
    echo 'testing maven'
    checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '9c2c4b85-d15b-4721-b0fe-c11be6030233', url: 'https://github.com/alex-man21/java_jenkins_pipeline']]]
    sh 'mvn clean install'
    sh 'mvn -Dtest=BasicDemo test'
}

return this