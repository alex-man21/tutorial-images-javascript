
@Library('sharedlibs') _

pipeline {
    agent any
  tools { nodejs 'Node16.6.1' } // Pick your node version between 8, 10, 12, or 14

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('init') {
            steps {
                script {
                    demo = load "testing.groovy"
                    demo.checkout()
                }
                message("inside applitools sharedlib + init stage!")
            }
        }
        stage('build') {
            steps {
                    script {
                        demo.cleanInstall()
                        demo.echo();
                        demo.checkDirectory();
                    }
            }        
        }
        stage('test') {
            steps{
                script {
                    writeFile file: "./.applitools/BATCH_ID", text: "TICKET41806"
                    sh "ls -l ./.applitools/BATCH_ID"
                    sh "cat ./.applitools/BATCH_ID"
                    sh "ls -ltr ./.*"
                }

                Applitools(applitoolsApiKey: 'aSDUdmvAP1IwKVLmI996KxOk6MT3a2ZRaDGWRrn8Xh00110', notifyByCompletion: false, serverURL: 'https://eyes.applitools.com', ) {
                    message("Running applitools test")
                    ExternalGroovy()
                }
            }
        }
    }
}

