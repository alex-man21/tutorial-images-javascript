
def gv
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
            script {
                gv = load "testing.groovy"
            }
        }
        stage('Applitools') {
            steps {
                Applitools(applitoolsApiKey: 'aSDUdmvAP1IwKVLmI996KxOk6MT3a2ZRaDGWRrn8Xh00110', notifyByCompletion: false, serverURL: 'https://eyes.applitools.com') {
                    script {
                        gv.echo();
                    }
             }
            }        
        }
    }
}

