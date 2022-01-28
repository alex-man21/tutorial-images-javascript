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

// def testingModule
// def rootDir

pipeline {
    agent any
  tools { nodejs 'Node16.6.1' } // Pick your node version between 8, 10, 12, or 14

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('clone_repo') {
            steps {
                echo 'not really cloning repo'
                echo 'but it is initializing'

                // script {
                //     def rootDir = pwd
                //     def testModule = load "testing.Groovy"
                // }
            }
        }        
        // stage('test_init') {
        //     // environment {
        //     //     SSH_CREDS = "hello"
        //     // }
        //     // steps {
        //     //     sh 'echo "SSH private key is located at $SSH_CREDS"'
        //     //     sh 'echo "SSH user is $SSH_CREDS"'
        //     //     sh 'echo "SSH passphrase is $SSH_CREDS"'
        //     // }
        //     steps {
        //             // rootDir = sh 'pwd'
        //             // testModule = load "${rootDir}/testing.Groovy "
        //     }
            
        // }
        stage('Applitools') {
            steps {
                Applitools(applitoolsApiKey: 'aSDUdmvAP1IwKVLmI996KxOk6MT3a2ZRaDGWRrn8Xh00110', notifyByCompletion: false, serverURL: 'https://eyes.applitools.com') {
    // some block
                script {
                    def rootDir = pwd
                    def testModule = load "testing.Groovy"
                    testModule.npmTest("inside groovy")
                }
                    // npmTest("outside groovy")
                    // mvnTest()
             }
            }        
        }
    }
}

